package Chess.Controller;

import Chess.Model.Game;
import Chess.Model.User;

public class GameController {
    private static Game currentGame = null;
    private static String noGameError = "Error: No active game";
    private static String coordinatesError = "Error: Invalid coordinates provided";
    public static String newGame(String secondUser) {
        User first = UserController.getLoggedInUser();
        User second = UserController.getUserByUsername(secondUser);
        if (first == null || second == null)
            return "Error: User not found!";
        currentGame = new Game(first, second);
        return "New Game started between " + first.getUsername() + " and " + second.getUsername();
    }

    private static boolean gameNotStarted() {
        return currentGame == null;
    }

    private static boolean coordinatesOutOfBounds(int x , int y) {
        return x > 7 || x < 0 || y > 7 || y < 0;
    }

    public static String selectPiece(int x, int y) {
        if (gameNotStarted())
            return noGameError;
        if (coordinatesOutOfBounds(x, y))
            return coordinatesError;
        if (currentGame.selectPiece(x, y))
            return "Piece at " + x + ", " + y + " selected";
        else
            return "Piece cannot be selected";
    }

    public static String movePiece(int x, int y) {
        if (gameNotStarted())
            return noGameError;
        if (coordinatesOutOfBounds(x, y))
            return coordinatesError;
        if (currentGame.movePiece(x, y))
            return "Selected piece moved to " + x + ", " + y;
        else
            return "Move cannot be done";
    }

    public static String print() {
        if (gameNotStarted())
            return noGameError;
        return currentGame.print();
    }
}
