package Printer;

import Logics.HiddenWord;
import Logics.UserLetter;
import Logics.Counter;

public class HiddenWordPrinter {
    private char[] letters;
    private char[] unNowWord = new char[HiddenWord.getWordLength()];
    private char userLetter;

    public HiddenWordPrinter(char[] letters, char userLatter) {
        this.letters = letters;
        this.userLetter = userLatter;
    }

    public void setUnNowWord() {
        for (int i = 0; i < unNowWord.length; i++) {
            unNowWord[i] = '*';
        }
        System.out.println();
    }

    public void updateUnNowWord() {
        UserLetter userLetter1 = new UserLetter();
        userLetter1.setLetter();
        userLetter = userLetter1.getUserLetter();
        int index = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == userLetter) {
                unNowWord[i] = userLetter;
                index++;
            }
        }
        if (index == 0) {
            Counter.setCounterDefeat();
        } else Counter.setCounterWin();
    }

    public void printUnNowWord() {
        for (int i = 0; i < unNowWord.length; i++) {
            System.out.print(unNowWord[i]);
        }
    }
}
