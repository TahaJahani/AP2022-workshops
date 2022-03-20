package Chess.Model.Pieces;

public class Pawn extends Piece{
    public Pawn(boolean black) {
        super("♟", "♙", black);
    }

    @Override
    public boolean isMovePossible(int x, int y, Piece[][] board) {
        int thisX = this.getX();
        int thisY = this.getY();
        // We consider that the black side always lies at the top
        boolean isValid = ((isBlack && x - thisX == 1) || (!isBlack && thisX - x == 1 )) &&
                (
                        (y - thisY == 0) ||
                        (
                                Math.abs(y - thisY) == 1 &&
                                board[x][y] != null &&
                                board[x][y].isBlack != isBlack
                        )
                );
        if (thisY - y == 0)
            isValid &= (board[x][y] == null);
        return isValid;
    }
}
