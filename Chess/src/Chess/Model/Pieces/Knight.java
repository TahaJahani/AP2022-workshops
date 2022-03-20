package Chess.Model.Pieces;

public class Knight extends Piece{
    public Knight(boolean black) {
        super("♞", "♘", black);
    }

    @Override
    public boolean isMovePossible(int x, int y, Piece[][] board) {
        int thisX = this.getX();
        int thisY = this.getY();
        boolean isValid =
                (Math.abs(thisX - x) == 2 && Math.abs(thisY - y) == 1) ||
                        (Math.abs(thisX - x) == 1 && Math.abs(thisY - y) == 2);
        isValid &= (board[x][y] == null);
        return isValid;
    }
}
