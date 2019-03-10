public class MyFirstGame {
    public static void main(String[] args) {
        int a;
        System.out.println("Отгадайте число от 0 до 100:");
        for (a = 45; a < 100; a++) {
            if (a == 50) {
                System.out.println("Верно, число: " + a);
                break;
            } else if (a >= 50) {
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Число меньше загаданного");
            }
        }
    }
}