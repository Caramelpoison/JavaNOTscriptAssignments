package healthWealth;

import java.util.ArrayList;
import java.util.List;

class UserManager {
    private List<User> users;
    private User currentUser;

    public UserManager() {
        users = new ArrayList<>();
        currentUser = null;
    }

    public void createUser(String username) {
        User user = new User(username);
        users.add(user);
        System.out.println("User created successfully.");
        System.out.println("");
    }

    public boolean loginUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                currentUser = user;
                System.out.println("Logged in as " + username + ".");
                System.out.println("");
                return true;
            }
        }
        System.out.println("User not found. Please create a new user.");
        return false;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public String getCurrentUsername() {
        if (currentUser != null) {
            return currentUser.getUsername();
        } else {
            return null;
        }
    }

}