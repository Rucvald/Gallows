import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class SomeWord {

    private String word;

    private int numberOfWords() throws FileNotFoundException {
        int numberOfWords = 0;
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numberOfWords++;
        }
        scanner.close();
        return numberOfWords;
    }

    private int random() throws FileNotFoundException {
        Random rand = new Random();
        int randomNum = rand.nextInt(numberOfWords())+1;
        return randomNum;
    }

    public void setWord() throws FileNotFoundException {
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        int randomNum = random();
        int i = 0;
        while(scanner.hasNextLine()&&i<randomNum){
            word = scanner.nextLine();
            i++;
        }
        scanner.close();
    }

    public String getWord() {
        return word;
    }
}
