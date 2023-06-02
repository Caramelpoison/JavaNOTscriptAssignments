package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bookstore {
    private List<Users> users;
    private List<Book> books;

    public Bookstore() {
        users = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void registerUser(String username, String password, String email) {
        Users user = new Users(username, password, email);
        users.add(user);
        System.out.println("Users registered successfully!");
    }

    public Users login(String username, String password) {
        for (Users user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Users logged in successfully!");
                return user;
            }
        }
        System.out.println("Invalid username or password!");
        return null;
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

    public void purchaseBook(Users user, Book book) {
        if (user != null) {
            System.out.println("Book purchased successfully!");
            System.out.println("Shipping details: ...");
            System.out.println("Payment details: ...");
        } else {
            System.out.println("Please log in before purchasing a book!");
        }
    }
}

