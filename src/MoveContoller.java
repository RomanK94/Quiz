import Exceptions.QuizInputException;

import java.util.Scanner;

public class MoveContoller {
    Scanner sc = new Scanner(System.in);
    private String dataIn;
    private int lengthAnswer = Word.getWord().getAnswer().length();
    public String move() throws QuizInputException {
        dataIn = sc.nextLine();
        if (dataIn.length() != 1 || dataIn.length() != lengthAnswer){
            throw new QuizInputException();
        }
        return dataIn;
    }
}
