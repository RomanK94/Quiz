import Exceptions.QuizInputException;

import java.util.Scanner;

public class MoveContoller {

    private String dataIn;
    private int lengthAnswer = Word.getWord().getAnswer().length();
    public String move(String dataIn) throws QuizInputException {
        if (dataIn.length() != 1 || dataIn.length() != lengthAnswer){
            throw new QuizInputException();
        }
        return dataIn;
    }
}
