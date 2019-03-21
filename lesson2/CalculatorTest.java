import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        int continueChoose = 0;
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        while (continueChoose == 1 || continueChoose == 0) {
            System.out.print("Введите первое число: ");
             calc.firstNumber = scanner.nextInt();
            System.out.print("Введите второе число: ");
             calc.secondNumber = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
             calc.getMatPerfomance();
            System.out.println("Если вы хотите продолжить: 1) да 2) нет");
             continueChoose = scanner.nextInt();
        }
        if (continueChoose == 2) {
            System.out.println("exit");
        } else {
            continueChoose++;
        }
    }
}
