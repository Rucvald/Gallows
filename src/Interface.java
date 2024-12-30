import java.io.FileNotFoundException;

public class Interface {

    public void interfaceMethod() throws FileNotFoundException {

        SomeWord someWord = new SomeWord();
        someWord.setWord();

        UserLetter userLetter = new UserLetter();

        Letters letters = new Letters(someWord.getWord());
        letters.wordToLetters();

        PrintUnNowWord unNowWordDefault = new PrintUnNowWord(letters.getLetters(), userLetter.getUserLetter());
        unNowWordDefault.setUnNowWord();

        PrintGallows printGallows = new PrintGallows();
        printGallows.setGallows();

        printGallows.printGallows();
        unNowWordDefault.printUnNowWord();

        PrintUnNowWord unNowWord = new PrintUnNowWord(letters.getLetters(), userLetter.getUserLetter());
        unNowWord.setUnNowWord();

        while (Counter.getCounterDefeat()<=8 && Counter.getCounterWin()<Letters.setLetters.size()){

            unNowWord.updateUnNowWord();

            switch (Counter.getCounterDefeat()){
                case 8:
                break;
                case 7: printGallows.changeGallows1();
                break;
                case 6: printGallows.changeGallows2();
                break;
                case 5: printGallows.changeGallows3();
                break;
                case 4: printGallows.changeGallows4();
                break;
                case 3: printGallows.changeGallows5();
                break;
                case 2: printGallows.changeGallows6();
                break;
                case 1: printGallows.changeGallows7();
                break;
                case 0: printGallows.changeGallows8();
                break;
            }
            printGallows.printGallows();
            unNowWord.printUnNowWord();
        }
        System.out.println("You are WINNER!!!!!");
    }
}