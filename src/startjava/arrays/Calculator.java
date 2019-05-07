import java.util.Scanner;

public class Calculator {
    public int firstNumber;
    public int secondNumber;
    String[] numbers = new String[3];

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; ++i) {
            numbers[0] = sc.next();
            numbers[1] = sc.next();
            numbers[2] = sc.next();
            firstNumber = Integer.parseInt(numbers[0]);
            secondNumber = Integer.parseInt(numbers[2]);
            if (numbers[1].equals("+")) {
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            }
            if (numbers[1].equals("-")) {
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            }
            if (numbers[1].equals("*")) {
                System.out.println("Result: " + ((double) firstNumber * secondNumber));
                break;
            }
            if (numbers[1].equals("/")) {
                System.out.println("Result: " + ((double) firstNumber / secondNumber));
                break;
            }
            if (numbers[1].equals("^")) {
                System.out.println("Result: " + (Math.pow(firstNumber, secondNumber)));
                break;
            }
            if (numbers[1].equals("%")) {
                System.out.println("Result: " + (firstNumber % secondNumber));
                break;
            }
            if (firstNumber % 2 != 0 || firstNumber % 2 != 1 || firstNumber != Integer.parseInt(numbers[0]))
                System.out.println("Uncorret Math Symbol");
            break;
        }
    }
}


