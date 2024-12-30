import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        File file = new File("D:/Programs/Lessons/Gallows", "words.txt");
        menu();
    }

    public static void menu() throws FileNotFoundException {
        boolean play = true;
        System.out.println("Welcome to Gallows!");
        System.out.println("Are you want to play or want to exit?\nIf you want to play, enter 'play' or 'exit' to exit'");
        while(play){
            Scanner scanner = new Scanner(System.in);
            String console = scanner.nextLine();

            if(console.equals("play")){
                Interface interface1 = new Interface();
                interface1.interfaceMethod();
            }
            if(console.equals("exit")){
                System.out.println("Goodbye!");
                play = false;
            }
            else
                System.out.println("Wrong input! If you want to play, enter 'play' or 'exit' to exit'");
        }

    }
}