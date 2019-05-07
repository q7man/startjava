import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    private String[] numbers = new String[10];
    int guessnumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        guessnumber = (int) (Math.random() * 10);
        System.out.println("You have 10 attemps! Enter through the space: ");
        while (true) {
            for (int i = 0; i < numbers.length; ++i) {
                numbers[i] = scanner.next();
                playerOne.number = Integer.parseInt(numbers[i]);
                numbers[i] = scanner.next();
                playerTwo.number = Integer.parseInt(numbers[i]);
                if (playerOne.number == guessnumber) {
                    System.out.println(playerOne.name + " guessed the number: " + guessnumber + " !!! Witch " + (i + 1) + " attemps.");
                    break;
                }
                if (playerTwo.number == guessnumber) {
                    System.out.println(playerTwo.name + " guessed the number: " + guessnumber + " !!! Witch " + (i + 1) + " attemps.");
                    break;
                }
            }
            break;
        }
    }
}
