import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws FileNotFoundException {
        boolean play = true;
        System.out.println("Welcome to Gallows!");
        while(play) {
            System.out.println("If you want to play, enter 'play' or 'exit' to exit:");
            Scanner scanner = new Scanner(System.in);
            String console = scanner.nextLine();

            ChoiceToGame choice = ChoiceToGame.DEFAULT;

            switch(console) {
                case "play":
                    choice = ChoiceToGame.PLAY;
                    break;
                case "exit":
                    choice = ChoiceToGame.EXIT;
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }

            switch(choice) {
                case PLAY:
                    Interface gameInterface = new Interface();
                    gameInterface.interfaceMethod();
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    play = false;
                    break;
            }
        }
    }
}
enum ChoiceToGame {
    DEFAULT(" "),
    PLAY("play"),
    EXIT("exit");
    private String choice;
    ChoiceToGame(String choice) {
        this.choice = choice;
    }
}