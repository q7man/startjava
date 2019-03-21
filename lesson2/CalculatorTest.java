import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Калькулятор!");
        System.out.print("Введите первое число: ");
        calc.firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        calc.secondNumber = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        calc.matOperation = scanner.nextLine();
        calc.matLogic();
        System.out.println("Если вы хотите продолжить: 1) да 2) нет");
        calc.continueChoose = scanner.nextInt();
        while (calc.continueChoose == 1) {
            System.out.print("Введите первое число: ");
            calc.firstNumber = scanner.nextInt();
            System.out.print("Введите второе число: ");
            calc.secondNumber = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            calc.matOperation = scanner.nextLine();
            calc.matLogic();
            System.out.println("Если вы хотите продолжить: 1) да 2) нет");
            calc.continueChoose = scanner.nextInt();
        }
        if (calc.continueChoose == 2) {
            System.out.println("exit");
        } else {
            calc.continueChoose++;
        }
    }
}
