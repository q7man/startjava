import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player playerOne;                   //переназначение? объявляем 2 объекта/переменные? в род. классе с именем класса Player и вызываем в main ввод
    private Player playerTwo;                   // не считывает строку =\
    public int guessnumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        guessnumber = (int) (Math.random() * 10);
        System.out.print(playerOne.name + " enter your number: ");
        playerOne.setScoreone(scanner.nextInt());
        if (playerOne.number == guessnumber) {
            System.out.println(playerOne.name + " number is right! ");
        }
        System.out.print(playerTwo.name + " enter your number: ");
        playerTwo.setScoreone(scanner.nextInt());
        if (playerTwo.number == guessnumber) {
            System.out.println(playerTwo.name + " number is right! ");
        }
        System.out.println("The Guess Number was: " + guessnumber);
    }
}