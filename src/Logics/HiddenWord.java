package Logics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HiddenWord {

    private String word;
    private static char[] letters;

    public void setWord() throws FileNotFoundException, InterruptedException {
        Scanner scanner = getScanner();
        int randomNum = random();
        int i = 0;
        while(scanner.hasNextLine()&&i<randomNum){
            word = scanner.nextLine();
            i++;
        }
        scanner.close();
    }

    private int random() throws FileNotFoundException, InterruptedException {
        Random rand = new Random();
        int randomNum = rand.nextInt(numberOfWords())+1;
        return randomNum;
    }

    private int numberOfWords() throws FileNotFoundException, InterruptedException {
        int numberOfWords = 0;
        Scanner scanner = getScanner();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numberOfWords++;
        }
        scanner.close();
        return numberOfWords;
    }

//    public String getWord() {
//        return word;
//    }

    private Scanner getScanner() throws FileNotFoundException, InterruptedException {
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file.getAbsoluteFile());
        return scanner;
    }

    public void wordToLetters(){
        letters = word.toCharArray();
    }

    public static char[] getLetters(){
        return letters;
    }

    public static int getWordLength(){
        return letters.length;
    }
}