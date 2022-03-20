package Chess.Model.Pieces;

public class Rook extends Piece {
    public Rook(boolean black) {
        super("♜", "♖", black);
    }

    @Override
    public boolean isMovePossible(int x, int y, Piece[][] board) {
        int thisX = this.getX();
        int thisY = this.getY();
        boolean isValid =
                (thisX - x == 0 && thisY - y != 0) ||
                        (thisY - y == 0 && thisX - x != 0);
        int stepX = (thisX > x) ? -1 : 1;
        int stepY = (thisY > y) ? -1 : 1;
        if (thisX - x == 0 && thisY - y != 0) {
            for (; thisY != y; thisY += stepY)
                isValid &= (board[thisX][thisY] == null);
        } else if (thisY - y == 0 && thisX - x != 0) {
            for (; thisX != x; thisX += stepX)
                isValid &= (board[thisX][thisY] == null);
        }
        return isValid;
    }
}
