import java.io.FileNotFoundException;

public class Interface {

    public void gameInterface() throws FileNotFoundException, InterruptedException {

        HiddenWord hiddenWord = new HiddenWord();
        System.out.println("-------------");
        hiddenWord.setWord();
        System.out.println("-------------");
        UserLetter userLetter = new UserLetter();
        System.out.println("-------------");
        hiddenWord.wordToLetters();
//        Letters letters = new Letters(hiddenWord.getWord());
//        letters.wordToLetters();

        PrintUnNowWord unNowWordDefault = new PrintUnNowWord(HiddenWord.getLetters(), userLetter.getUserLetter());
        unNowWordDefault.setUnNowWord();

        GallowsPrinter printGallows = new GallowsPrinter();
        printGallows.setGallows();

        printGallows.printGallows();
        unNowWordDefault.printUnNowWord();

        PrintUnNowWord unNowWord = new PrintUnNowWord(HiddenWord.getLetters(), userLetter.getUserLetter());
        unNowWord.setUnNowWord();

        while (Counter.getCounterDefeat()>0 && Counter.getCounterWin()<HiddenWord.getLetters().length){

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
        if (Counter.getCounterDefeat()<=0){
            System.out.println("\nYou loose!");
            Counter.resetCounter();
        }
        else {
            System.out.println("\nYou are WINNER!!!!!");
            Counter.resetCounter();
        }
    }
}