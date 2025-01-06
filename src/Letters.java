import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Letters {

    private String word;
    char[] letters;
    public static int length;
    public static Set<Character> setLetters = new HashSet<Character>();

    Letters(String word){
        this.word = word;
        length = word.length();
    }

    public void wordToLetters(){
        letters = word.toCharArray();
        for(Character letter : letters){
            setLetters.add(letter);
        }
    }

    public char[] getLetters(){
        return letters;
    }

}
