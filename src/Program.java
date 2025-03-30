import BoardGame.Board;
import BoardGame.ChessMatch;
import BoardGame.UI;

public class Program {
    public static void main (String[]args){

        Board board = new Board(8,8);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}