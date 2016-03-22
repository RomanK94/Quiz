import Exceptions.QuizInputException;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = Board.getBoard();
        Word word = Word.getWord();
        WinnerController winnerController = new WinnerController();
        MoveContoller moveContoller = new MoveContoller();
        System.out.println("Hello, I greet you in the quiz!");
        while (!winnerController.isFlagWinner()) {
            try {
                System.out.println(word.getQuestion());
                board.printBoard();
                String input = moveContoller.move(sc.nextLine());
                winnerController.decide(input);
            } catch (QuizInputException e) {
                System.out.println("The number of entered characters is incorrect");
            }
        }
    }
}
