import java.util.ArrayList;

public class WinnerController {

    Board board = Board.getBoard();
    Word word = Word.getWord();
    private int lengthAnswer = word.getAnswer().length();
    private String answer = word.getAnswer().toLowerCase();
    private boolean flagWinner = false;

    ArrayList<Character> letters = new ArrayList<Character>();

    public WinnerController() {
        char[] letter = answer.toCharArray();
        for (int i = 0; i < lengthAnswer; i++) {
            letters.add(letter[i]);
        }
    }

    public void decide(String inputWord) {
        if (inputWord.length() == 1) {
            char letter = inputWord.charAt(0);
            this.checkLetter(letter);
            if (letters.equals(board.lettersOnBoard)) {
                this.win();
            }
        } else checkWord(inputWord);
    }

    public void win() {
        System.out.println("Congratulations!");
        System.out.println("The answer is " + word.getAnswer());
        System.out.println("You win!");
        flagWinner = true;
    }

    public void fillWord(char letter) {
        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i).equals(letter)) {
                board.lettersOnBoard.set(i, letter);
            }
        }
    }

    public void checkWord(String inputWord) {
        if (inputWord.length() == lengthAnswer) {
            if (inputWord.equals(answer)) {
                this.win();
            } else {
                System.out.println("Your word is incorrect, try again");
            }
        }
    }

    public void checkLetter(char letter) {
        if (letters.contains(letter)) {
            this.fillWord(letter);
        } else {
            System.out.println("Your letter is not found, try again");
        }
    }

    public boolean isFlagWinner() {
        return flagWinner;
    }
}

