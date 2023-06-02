package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
class UserService {
    private List<Users> users;

    public UserService() {
        users = new ArrayList<>();
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

    public void registerUser(String username, String password, String email) {
        if (!isValidUsername(username)) {
            System.out.println("Invalid username! Please provide a valid username.");
            return;
        }

        if (!isValidPassword(password)) {
            System.out.println("Invalid password! Please provide a valid password.");
            return;
        }

        if (!isValidEmail(email)) {
            System.out.println("Invalid email! Please provide a valid email address.");
            return;
        }

        Users user = new Users(username, password, email);
        users.add(user);
        System.out.println("User registered successfully!");
    }

    private boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z0-9]{3,20}$";
        return Pattern.matches(regex, username);
    }

    private boolean isValidPassword(String password) {
        String regex = "^[a-zA-Z0-9]{6,20}$";
        return Pattern.matches(regex, password);
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, email);
    }
}