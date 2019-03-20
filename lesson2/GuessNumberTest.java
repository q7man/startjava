public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Отгадайте число от 0 до 10!");
        System.out.println("Введите имя игрока:");
        GuessNumber gussNum = new GuessNumber((int) (Math.random() * 10));
        gussNum.endGame();
    }
}
