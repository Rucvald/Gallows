package Logics;

import java.util.Scanner;

public class UserLetter {

    private char userLetter = ' ';

    public void setLetter() {
        boolean incorrectSymbol = true;
        Scanner scanner = new Scanner(System.in);
        while (incorrectSymbol) {
            System.out.println("\nEnter a letter: ");
            String userSymbol = scanner.nextLine();
            if (userSymbol.length() == 1 && Character.isLetter(userSymbol.charAt(0))) {
                userLetter = userSymbol.charAt(0);
                System.out.println("You entered: " + userLetter);
                incorrectSymbol = false;
            } else
                System.out.print("You must enter one letter! Try again.");
        }
    }

    public char getUserLetter() {
        return userLetter;
    }
}
