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

    public void Guess() {
        Player gamePlayers = new Player();
        guessnumber = (int) (Math.random() * 10 + 1);
        System.out.print(playerOne + " enter your number: ");
        gamePlayers.setScoreone(scanner.nextInt());
        if (gamePlayers.playerNumber == guessnumber) {
            System.out.println(playerOne + " number is right! ");
        }
        System.out.print(playerTwo + " enter your number: ");
        gamePlayers.setScoreone(scanner.nextInt());
        if (gamePlayers.playerNumber == guessnumber) {
            System.out.println(playerTwo + " number is right! ");
        }
        System.out.println("The Guess Number was: " + this.guessnumber);
    }
}