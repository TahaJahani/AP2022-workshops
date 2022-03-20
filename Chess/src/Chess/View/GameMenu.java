package Chess.View;

import Chess.Controller.GameController;

import java.util.Scanner;

public class GameMenu extends Menu {

    @Override
    public boolean checkCommand(String command) {
        if (command.equals("print")) {
            System.out.println(GameController.print());
        }
        return false;
    }
}
