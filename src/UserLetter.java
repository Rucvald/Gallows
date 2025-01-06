import java.util.Scanner;

public class UserLetter {

    private char userLetter = ' ';

    public void setLetter() {
        boolean notGood = true;
        Scanner scanner = new Scanner(System.in);
        while (notGood) {
            System.out.print("\nEnter a letter: ");
            String userSymbol = scanner.nextLine();
            if(userSymbol.length() == 1) {
                userLetter = userSymbol.charAt(0);
                System.out.println("You entered: " + userLetter);
                notGood = false;
            }
            else
                System.out.print("You enter more than one letter! Try again.");
        }
    }

    public char getUserLetter() {
        return userLetter;
    }
}
