package Chess.Model.Pieces;

public class King extends Piece{
    public King(boolean black) {
        super("♚", "♔", black);
    }

    @Override
    public boolean isMovePossible(int x, int y, Piece[][] board) {
        int thisX = this.getX();
        int thisY = this.getY();
        return (Math.abs(thisX - x) < 1)
                && (Math.abs(thisY - y) < 1)
                && (board[x][y] == null);
    }
}
