package Logics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        menu();
    }

    public static void menu() throws FileNotFoundException, InterruptedException {
        boolean play = true;
        System.out.println("Welcome to Gallows!");
        while (play) {
            System.out.println("If you want to play, enter 'play' or 'exit' to exit:");
            Scanner scanner = new Scanner(System.in);
            String console = scanner.nextLine();

            ChoiceToGame choice = ChoiceToGame.MENU;

            switch (console) {
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
                    gameInterface.gameInterface();
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    play = false;
                    break;
            }
        }
    }
}