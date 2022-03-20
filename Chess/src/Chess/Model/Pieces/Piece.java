package Chess.Model.Pieces;

import Chess.Model.Game;

public class Piece {
    // Private: no class except own class
    // Public: all classes
    // Protected: own class and child classes
    private final String icon;
    protected boolean isBlack;
    private int x;
    private int y;

    public Piece(String iconBlack, String iconWhite, boolean isBlack) {
        if (isBlack)
            this.icon = iconBlack;
        else
            this.icon = iconWhite;
        this.isBlack = isBlack;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean move(int x, int y, Game game) {
        if (isMovePossible(x, y, game.getBoard())) {
            game.setPiece(this.x, this.y, null);
            game.setPiece(x, y, this);
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }

    public boolean isMovePossible(int x, int y, Piece[][] board) {
        return true;
    }

    public String getIcon() {
        return icon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
