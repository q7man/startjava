import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player playerOne;
    private Player playerTwo;
    public int guessnumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        while (true) {
            guessnumber = (int) (Math.random() * 10);
            System.out.print(playerOne.name + " enter your number: ");
            playerOne.setNumber(scanner.nextInt());
            System.out.print(playerTwo.name + " enter your number: ");
            playerTwo.setNumber(scanner.nextInt());
            if (playerOne.number == guessnumber) {
                System.out.println(playerOne.name + " number is right! ");
                System.out.println("The Guess Number was: " + guessnumber);
                break;
            }
            if (playerTwo.number == guessnumber) {
                System.out.println(playerTwo.name + " number is right! ");
                System.out.println("The Guess Number was: " + guessnumber);
                break;
            }
            System.out.println("Try again");
        }
    }
}