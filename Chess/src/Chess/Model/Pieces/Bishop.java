package Chess.Model.Pieces;

public class Bishop extends Piece{
    public Bishop(boolean black) {
        super("♝", "♗", black);
    }

    @Override
    public boolean isMovePossible(int x, int y, Piece[][] board) {
        int thisX = this.getX();
        int thisY = this.getY();
        boolean isValid = (Math.abs(thisX - x) / (thisY - y) == 1);
        int stepX = (thisX > x) ? -1 : 1;
        int stepY = (thisY > y) ? -1 : 1;
        for (; thisY != y; thisY += stepY, thisX += stepX)
            isValid &= (board[thisX][thisY] == null);
        return isValid;
    }
}
