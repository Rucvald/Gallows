import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PrintUnNowWord {
    private char[] letters;
    private char[] unNowWord = new char[Letters.length];
    private char userLetter;

    PrintUnNowWord(char[] letters, char userLatter) {
        this.letters = letters;
        this.userLetter = userLatter;
    }

    public void setUnNowWord() {
        for (int i = 0; i < unNowWord.length; i++) {
            unNowWord[i] = '*';
        }
    }

    public void updateUnNowWord() throws FileNotFoundException {
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
            Counter.setCounterDefit();
        }
        else Counter.setCounterWin();
    }

    public void printUnNowWord() {
        for (int i = 0; i < unNowWord.length; i++) {
            System.out.print(unNowWord[i]);
        }
    }
}
