package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

public class BookstoreTest {
    @Mock
    private UserService userService;

    @Mock
    private BookService bookService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    public void tearDown() {
        userService = null;
        bookService = null;
    }

    @Test
    public void testUserRegister_Success() {
        String username = "Barney";
        String password = "Cocomelon";
        String email = "Barney@PBS.com";
        doNothing().when(userService).registerUser(username, password, email);

        userService.registerUser(username, password, email);

        verify(userService, times(1)).registerUser(username, password, email);
    }

    @Test
    public void testUserRegister_Fail() {
        String username = "Barney";
        String password = "Cocomelon";
        String email = "Barney@PBS.com";
        doThrow(new RuntimeException("Registration failed")).when(userService).registerUser(username, password, email);

        try {
            userService.registerUser(username, password, email);
            fail("Expected exception not thrown");
        } catch (RuntimeException e) {
            assertEquals("Registration failed", e.getMessage());
            verify(userService, times(1)).registerUser(username, password, email);
        }
    }

    @Test
    public void testUserLogin_Success() {
        String username = "Barney";
        String password = "Cocomelon";
        Users user = new Users(username, password, "Barney@PBS.com");
        when(userService.login(username, password)).thenReturn(user);

        Users loggedInUser = userService.login(username, password);

        assertNotNull(loggedInUser);
        assertEquals(username, loggedInUser.getUsername());
        assertEquals(password, loggedInUser.getPassword());
        verify(userService, times(1)).login(username, password);
    }

    @Test
    public void testUserLogin_Fail() {
        String username = "Barney";
        String password = "Cocomelon";
        when(userService.login(username, password)).thenReturn(null);

        Users loggedInUser = userService.login(username, password);

        assertNull(loggedInUser);
        verify(userService, times(1)).login(username, password);
    }

    @Test
    public void testBookSearch_Success() {
        String keyword = "Daniel Radicalcliffington";
        List<Book> matchingBooks = List.of(new Book("Daniel Radicalcliffington and Some Stone", "Hector", "Fantasy"));
        when(bookService.searchBooks(keyword)).thenReturn(matchingBooks);

        List<Book> searchResults = bookService.searchBooks(keyword);

        assertEquals(1, searchResults.size());
        Book book = searchResults.get(0);
        assertEquals("Daniel Radicalcliffington and Some Stone", book.getTitle());
        assertEquals("Hector", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
        verify(bookService, times(1)).searchBooks(keyword);
    }

    @Test
    public void testBookSearch_Fail() {
        String keyword = "Nonexistent";
        when(bookService.searchBooks(keyword)).thenReturn(List.of());

        List<Book> searchResults = bookService.searchBooks(keyword);

        assertTrue(searchResults.isEmpty());
        verify(bookService, times(1)).searchBooks(keyword);
    }

    @Test
    public void testBookSearch_Empty() {
        String keyword = "";
        when(bookService.searchBooks(keyword)).thenReturn(List.of());

        List<Book> searchResults = bookService.searchBooks(keyword);

        assertTrue(searchResults.isEmpty());
        verify(bookService, times(1)).searchBooks(keyword);
    }

    @Test
    public void testBookBuy_NotLoggedIn() {
        Users loggedInUser = null;
        String title = "Daniel Radicalcliffington";
        List<Book> matchingBooks = List.of(new Book("Daniel Radicalcliffington and Some Stone", "Hector", "Fantasy"));
        when(bookService.searchBooks(title)).thenReturn(matchingBooks);

        bookService.buyBook(bookService);

        verify(bookService, never()).searchBooks(title);
    }

    @Test
    public void testBookBuy_Success() {
        Users loggedInUser = new Users("Barney", "Cocomelon", "Barney@PBS.com");
        String title = "Daniel Radicalcliffington and Some Stone";
        List<Book> matchingBooks = List.of(new Book("Daniel Radicalcliffington and Some Stone", "Hector", "Fantasy"));
        when(bookService.searchBooks(title)).thenReturn(matchingBooks);

        bookService.buyBook(bookService);

        verify(bookService, times(1)).searchBooks(title);
    }

    @Test
    public void testBookBuy_Fail() {
        Users loggedInUser = new Users("Barney", "Cocomelon", "Barney@PBS.com");
        String title = "Daniel Radicalcliffington and Some Stone";
        when(bookService.searchBooks(title)).thenReturn(List.of());

        bookService.buyBook(bookService);

        verify(bookService, times(1)).searchBooks(title);
    }

    @Test
    public void testBookBuy_NoMatch() {
        Users loggedInUser = new Users("Barney", "Cocomelon", "Barney@PBS.com");
        String title = "Daniel Radicalcliffington and Some Stone";
        when(bookService.searchBooks(title)).thenReturn(List.of());

        bookService.buyBook(bookService);

        verify(bookService, times(1)).searchBooks(title);
    }
}
