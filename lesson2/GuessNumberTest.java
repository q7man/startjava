import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoose;
        System.out.println("Guess the Number!");
        System.out.println("Please enter your names: ");
        Player playerOne = new Player(scanner.next());
        Player playerTwo = new Player(scanner.next());
        GuessNumber guessNum = new GuessNumber(playerOne, playerTwo);
        boolean variable;

        while (variable = true) {
            guessNum.guess();
            if (playerOne.number == guessNum.guessnumber || playerTwo.number == guessNum.guessnumber)
                do {
                    System.out.println("Wish to continue: yes/no");
                    continueChoose = scanner.next();
                    if (continueChoose.equals("yes")) {
                        System.out.println("Continue");
                    } else if (continueChoose.equals("no")) {
                        System.out.println("Exit");
                        variable = false;
                        return;
                    } else {
                        System.out.println("Uncorrted answer");
                    }
            } while (continueChoose == "yes");
        }
    }
}