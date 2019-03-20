import java.util.Scanner;
public class Player {
    Scanner scanner = new Scanner(System.in);
    int score;
    int scoretwo;
    String Playerone = scanner.nextLine();
    String Playertwo = scanner.nextLine();

    public Player(int score, int scoretwo) {
        System.out.println("Введите ваши числа:");
        Scanner scanner = new Scanner(System.in);
        this.score = scanner.nextInt();
        this.scoretwo = scanner.nextInt();
    }
}
