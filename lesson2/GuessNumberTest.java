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

        do {
            guessNum.Guess();
            do {
                System.out.println("Wish to continue: yes/no");
                continueChoose = scanner.next();
                if (continueChoose.equals("yes")) {
                    System.out.println("Continue");
                } else if (continueChoose.equals("no")) {
                    System.out.println("Exit");
                    break;
                } else {
                    System.out.println("Uncorrted answer");
                }
            } while (!continueChoose.equals("yes"));
        } while (!continueChoose.equals("no"));
    }
}