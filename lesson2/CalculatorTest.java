import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoose;
        Calculator calc = new Calculator();
        do {
            System.out.print("Enter first number: ");
            calc.firstNumber = scanner.nextInt();
            System.out.print("Enter second number ");
            calc.secondNumber = scanner.nextInt();
            System.out.print("Enter Math symbol: ");
            calc.matOperation = scanner.next();
            calc.Calculate();
            do {
                System.out.println("Wish to continue: yes/no");
                continueChoose = scanner.next();
                if (continueChoose.equals("yes")) {
                    System.out.println("Continue");
                } else if (continueChoose.equals("no")) {
                    System.out.println("Exit");
                    break;
                } else {
                    System.out.println("Uncorrted answer");
                }
            } while (!continueChoose.equals("yes"));
        } while (!continueChoose.equals("no"));
    }
}