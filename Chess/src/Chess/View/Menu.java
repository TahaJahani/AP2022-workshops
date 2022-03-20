package Chess.View;

import java.util.Scanner;

public class Menu {
    public void run(Scanner scanner) {
        String command = "";
        while (true) {
            command = scanner.nextLine();
            if (checkCommand(command))
                break;
        }
    }

    public void printMessage(String message) {
        if (isError(message))
            System.err.println(message);
        else
            System.out.println(message);
    }

    public boolean isError(String message) {
        return message.startsWith("Error:");
    }

    public boolean checkCommand(String command) {
        return false;
    }
}
