import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class SomeWord {

    private String word;

    private int random(){
        Random rand = new Random();
        int randomNum = rand.nextInt(3)+1;
        return randomNum;
    }

    public void setWord() throws FileNotFoundException {
        File file = new File("D:/Programs/Lessons/Gallows/words.txt");
        Scanner scanner = new Scanner(file);
        int randomNum = random();
        int i = 0;
        while(scanner.hasNextLine()&&i<randomNum){
            word = scanner.nextLine();
            i++;
        }
        scanner.close();
    }

    public String getWord() throws FileNotFoundException {
        return word;
    }
}
