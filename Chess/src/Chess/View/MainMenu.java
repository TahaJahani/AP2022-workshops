package Chess.View;

import Chess.Controller.GameController;
import Chess.Controller.UserController;
import Chess.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu extends Menu {

    @Override
    public boolean checkCommand(String command) {
        if (command.startsWith("register")) {
            String[] args = command.split(" ");
            String result = UserController.register(args[1], args[2]);
            printMessage(result);
        } else if (command.startsWith("login")) {
            String[] args = command.split(" ");
            String result = UserController.login(args[1], args[2]);
            printMessage(result);
        } else if (command.startsWith("start game")) {
            String[] args = command.split(" ");
            String result = GameController.newGame(args[2]);
            printMessage(result);
            return !isError(result); //If no error, we need to exit this menu so returns true
        } else if (command.startsWith("list")) {
            String[] args = command.split(" ");
            boolean all = args.length > 1 && args[1].equals("-a");
            List<User> usersList = UserController.listUsers(all);
            printUsers(usersList);
        }
        return false;
    }

    private void printUsers(List<User> users) {
        for (User user : users)
            //TODO: how?! with toString()!
            System.out.println(user);
    }
}
