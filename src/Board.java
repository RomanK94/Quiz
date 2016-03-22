import java.util.ArrayList;

public class Board {
    private static Board board;
    public ArrayList<Character> lettersOnBoard = new ArrayList<Character>();
    private int length = Word.getWord().getAnswer().length();

    public void printBoard(){
        for (Character letter : lettersOnBoard){
            System.out.print(letter);
        }
        System.out.println();
    }
    private Board() {
        for (int i = 0; i < length; i++) {
            lettersOnBoard.add('~');
        }
    }

    public static Board getBoard() {
        if (board == null) {
            board = new Board();
        }
        return board;
    }
}
