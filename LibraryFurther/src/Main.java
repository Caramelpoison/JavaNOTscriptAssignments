import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("CocoMelon", "billy", 2001, 300, "Fiction"));
        library.addBook(new Book("Barney", "timmy", 2002, 400, "Non-Fiction"));
        library.addBook(new Book("Elmo", "sally", 2020, 500, "Science"));
        library.addBook(new Book("Naruto", "sue", 2023, 6000, "History"));

        List<Book> booksByYear = library.findBooksByYear(2002);
        System.out.println("2002 Books:");
        for (Book book : booksByYear) {
            System.out.println(book.getTitle());
        }


        List<Book> booksByAuthor = library.bookByAuthor("timmy");
        System.out.println("Books by timmy:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        Book bookWithMostPages = library.mostPages();
        System.out.println("Book with the most pages: " + bookWithMostPages.getTitle());


        int pages = 400;
        List<Book> booksByPageCount = library.pagesMoreThan(pages);
        System.out.println("Books with more than " + pages + " pages:");
        for (Book book : booksByPageCount) {
            System.out.println(book.getTitle());
        }

        List<String> bookTitles = new ArrayList<>();
        for (Book book : library.getBooks()) {
            bookTitles.add(book.getTitle());
        }

        Collections.sort(bookTitles);
        System.out.println("Sorted alpha:");
        for (String title : bookTitles) {
            System.out.println(title);
        }


        User user = new User("Hector", 202023);
        library.makeNewU(user);
        Book bookToLoan = library.getBooks().get(0);
        library.loanBook(bookToLoan, user);

        library.returnBook(bookToLoan, user);
    }
}
