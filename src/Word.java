import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
    private static Word word;
    private String answer;
    private String question;
    private HashMap<String, String> map = new HashMap<>();
    private BufferedReader inputStream;

    private Word() {
        try {
            inputStream = new BufferedReader(new FileReader("question-answer.txt"));
            while (inputStream.ready()) {
                String line = inputStream.readLine();
                String[] text = line.split(" : ");
                map.put(text[1], text[0]);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Data file with question isn't found");
        } catch (IOException exception) {
            System.out.println("Problem with Input Stream");
        }

        Random random = new Random();
        List<String> keys = new ArrayList<String>(map.keySet());
        answer = keys.get(random.nextInt(keys.size()));
        question = map.get(answer);
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public static Word getWord() {
        if (word == null) {
            word = new Word();
        }
        return word;
    }

}

