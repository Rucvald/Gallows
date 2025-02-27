package Logics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HiddenWord {

    private String word;
    private static char[] letters;

    public void setWord() {
        Scanner scanner = getScanner();
        int randomNum;
        randomNum = random();
        int i = 0;
        while (scanner.hasNextLine() && i < randomNum) {
            word = scanner.nextLine();
            i++;
        }
        scanner.close();
    }

    private int random() {
        Random rand = new Random();
        return rand.nextInt(numberOfWords()) + 1;
    }

    private int numberOfWords() {
        int numberOfWords = 0;
        Scanner scanner = getScanner();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numberOfWords++;
        }
        scanner.close();
        return numberOfWords;
    }

    private Scanner getScanner() {
        File file = new File("words.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file.getAbsoluteFile());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return scanner;
    }

    public void wordToLetters() {
        letters = word.toCharArray();
    }

    public static char[] getLetters() {
        return letters;
    }

    public static int getWordLength() {
        return letters.length;
    }
}