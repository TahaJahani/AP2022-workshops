package Chess.Controller;

import Chess.Model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserController {
    private static ArrayList<User> allUsers = new ArrayList<>();
    private static User loggedInUser = null;

    public static String register(String username, String password) {
        if (isUsernameUnique(username)) {
            User user = new User(username, password);
            allUsers.add(user);
            return "OK";
        }
        return "Error: Username is already used";
    }

    public static String login(String username, String password) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                loggedInUser = user;
                return "Welcome!";
        }
        return "Error: Username or password is invalid";
    }

    private static boolean isUsernameUnique(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public static User getUserByUsername(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static List<User> listUsers(boolean all) {
        if (all)
            return allUsers;
        allUsers.sort(Comparator.comparingInt(User::getScore));
        return allUsers.subList(0, Math.min(3, allUsers.size()));
    }
}
