import java.util.Scanner;
public class GuessNumber {
    int number;
    int logic;

    public GuessNumber(int number) {
        Player ww = new Player((int) (Math.random() * 10), (int) (Math.random() * 10));
        this.number = (int) (Math.random() * 10);
        System.out.println(ww.Playerone + " думает, что это " + ww.score + ". Загадано было " + this.number);
        System.out.println(ww.Playertwo + " думает, что это " + ww.scoretwo + ". Загадано было " + this.number);
        if (ww.score == this.number) {
            System.out.println(ww.Playerone + " отгадал. Это число: " + this.number);
        }
        if (ww.scoretwo == this.number) {
            System.out.println(ww.Playertwo + " отгадал. Это число: " + this.number);
        }
    }

    String endGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если вы хотите продолжить: 1) да 2) нет");
        logic = scanner.nextInt();
        while (logic == 1) {
            System.out.println("Отгадайте число от 0 до 10!");
            System.out.println("Введите имя игрока:");
            GuessNumber guss = new GuessNumber((int) (Math.random() * 10));
            endGame();
        }
        if (logic == 2) {
            System.out.println("Игра завершена");
            return "";
        } else {
            return endGame();
        }
    }
}
