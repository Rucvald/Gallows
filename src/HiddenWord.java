import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HiddenWord {

    private String word;

    public void setWord() throws FileNotFoundException {
        Scanner scanner = getScanner();
        int randomNum = random();
        int i = 0;
        while(scanner.hasNextLine()&&i<randomNum){
            word = scanner.nextLine();
            i++;
        }
    }

    private int random() throws FileNotFoundException {
        Random rand = new Random();
        int randomNum = rand.nextInt(numberOfWords())+1;
        return randomNum;
    }

    private int numberOfWords() throws FileNotFoundException {
        int numberOfWords = 0;
        Scanner scanner = getScanner();
        while (scanner.hasNextLine()) {
            numberOfWords++;
        }
        return numberOfWords;
    }

    public String getWord() {
        return word;
    }

    private Scanner getScanner() throws FileNotFoundException {
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        scanner.close();
        return scanner;
    }
}





//String line = scanner.nextLine();