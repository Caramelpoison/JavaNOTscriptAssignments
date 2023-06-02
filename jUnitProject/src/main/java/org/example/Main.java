package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bookstore bookstore = new Bookstore();
    private static Users loggedInUser = null;

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("--------- Bookstore Menu ---------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Search Books");
            System.out.println("4. Purchase Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    performUserRegistration();
                    break;
                case 2:
                    performUserLogin();
                    break;
                case 3:
                    performBookSearch();
                    break;
                case 4:
                    performBookPurchase();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void performUserRegistration() {
        System.out.println("--------- User Registration ---------");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        bookstore.registerUser(username, password, email);
        System.out.println();
    }

    private static void performUserLogin() {
        System.out.println("--------- User Login ---------");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        loggedInUser = bookstore.login(username, password);
        System.out.println();
    }

    private static void performBookSearch() {
        System.out.println("--------- Book Search ---------");
        if (loggedInUser == null) {
            System.out.println("Please log in before searching for books.");
            System.out.println();
            return;
        }

        System.out.print("Enter a keyword to search for books: ");
        String keyword = scanner.nextLine();

        List<Book> searchResults = bookstore.searchBooks(keyword);
        if (searchResults.isEmpty()) {
            System.out.println("No books found matching the keyword.");
        } else {
            System.out.println("Search Results:");
            for (Book book : searchResults) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getGenre() + ")");
            }
        }
        System.out.println();
    }

    private static void performBookPurchase() {
        System.out.println("--------- Book Purchase ---------");
        if (loggedInUser == null) {
            System.out.println("Please log in before purchasing a book.");
            System.out.println();
            return;
        }

        System.out.print("Enter the title of the book to purchase: ");
        String title = scanner.nextLine();

        List<Book> searchResults = bookstore.searchBooks(title);
        if (searchResults.isEmpty()) {
            System.out.println("No books found with the given title.");
        } else {
            Book bookToPurchase = searchResults.get(0);
            bookstore.purchaseBook(loggedInUser, bookToPurchase);
        }
        System.out.println();
    }
}