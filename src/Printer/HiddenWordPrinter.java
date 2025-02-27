package Printer;

import Logics.HiddenWord;
import Logics.UserLetter;
import Logics.Counter;

public class HiddenWordPrinter {
    private final char[] letters;
    private final char[] hiddenWord = new char[HiddenWord.getWordLength()];
    private char userLetter;

    public HiddenWordPrinter(char[] letters, char userLatter) {
        this.letters = letters;
        this.userLetter = userLatter;
    }

    public void setHiddenWord() {
        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '*';
        }
        System.out.println();
    }

    public void updateHiddenWord() {
        UserLetter userLetter = new UserLetter();
        userLetter.setLetter();
        this.userLetter = userLetter.getUserLetter();
        int index = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == this.userLetter) {
                hiddenWord[i] = this.userLetter;
                index++;
            }
        }
        if (index == 0) {
            Counter.setCounterDefeat();
        } else Counter.setCounterWin(index);
    }

    public void printHiddenWord() {
        for (int i = 0; i < hiddenWord.length; i++) {
            System.out.print(hiddenWord[i]);
        }
    }
}
