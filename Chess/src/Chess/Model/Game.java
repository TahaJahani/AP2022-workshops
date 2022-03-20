package Chess.Model;

import Chess.Model.Pieces.*;

public class Game {
    private User white;
    private  User black;
    private boolean blackTurn;
    private Piece selectedPiece = null;
    //TODO: save current board? how? --> Solved!
    private Piece[][] board = new Piece[8][8];

    public Game(User first, User second) {
        this.white = first;
        this.black = second;
        this.blackTurn = false;
        initializeBoard();
    }

    private void initializeBoard() {
        board[0][0] = new Rook(true);
        board[7][0] = new Rook(true);
        board[6][0] = new Knight(true);
        board[1][0] = new Knight(true);
        board[2][0] = new Bishop(true);
        board[5][0] = new Bishop(true);
        board[3][0] = new King(true);
        board[4][0] = new Queen(true);

        board[0][7] = new Rook(false);
        board[7][7] = new Rook(false);
        board[6][7] = new Knight(false);
        board[1][7] = new Knight(false);
        board[2][7] = new Bishop(false);
        board[5][7] = new Bishop(false);
        board[3][7] = new King(false);
        board[4][7] = new Queen(false);

        for (int i = 0 ; i < 8 ; i++)
            board[i][1] = new Pawn(true);
        for (int i = 0 ; i < 8 ; i++)
            board[i][6] = new Pawn(false);

    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setPiece(int x, int y, Piece piece) {
        board[x][y] = piece;
    }

    public void changeTurn() {
        blackTurn = !blackTurn;
    }

    public boolean selectPiece(int x, int y) {
        if (board[x][y] != null && board[x][y].isBlack() == blackTurn) {
            selectedPiece = board[x][y];
            return true;
        }
        return false;
    }

    public boolean movePiece(int x, int y) {
        if (selectedPiece != null) {
            return selectedPiece.move(x, y, this);
        }
        return false;
    }

    public String print() {
        // HOW?!
        StringBuilder toPrint = new StringBuilder("Current game state: \n");
        for (int i = 0 ; i < 8 ; i++) {
            for (int j = 0 ; j < 8 ; j++) {
                toPrint.append("|");
                if (board[j][i] != null)
                    toPrint.append(board[j][i].getIcon());
                else
                    toPrint.append(" ");
            }
            toPrint.append("|\n");
        }
        return toPrint.toString();
    }
}
