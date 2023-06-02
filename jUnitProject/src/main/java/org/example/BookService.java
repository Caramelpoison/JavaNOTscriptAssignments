package org.example;

import java.util.ArrayList;
import java.util.List;

class BookService {
    private List<Book> books;

    public BookService() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String genre) {
        Book book = new Book(title, author, genre);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) ||
                    book.getAuthor().contains(keyword) ||
                    book.getGenre().contains(keyword)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public static void buyBook(BookService bookService) {
        String title = "Daniel Radicalcliffington and Some Stone";

        List<Book> searchResults = bookService.searchBooks(title);
        if (searchResults.isEmpty()) {
            System.out.println("No matching books found.");
        } else {
            Book bookToPurchase = searchResults.get(0);
            System.out.println("Book found: " + bookToPurchase.getTitle() + " by " +
                    bookToPurchase.getAuthor() + " (" + bookToPurchase.getGenre() + ")");

            System.out.println("Book purchased successfully!");
        }
    }
}
