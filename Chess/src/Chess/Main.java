package Chess;

import Chess.View.GameMenu;
import Chess.View.MainMenu;
import Chess.View.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        GameMenu gameMenu = new GameMenu();
        while (true) {
            mainMenu.run(scanner);
            gameMenu.run(scanner);
        }
    }
}
