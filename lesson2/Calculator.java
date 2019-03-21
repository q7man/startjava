import java.util.Scanner;
public class Calculator {
    public int firstNumber = 0;
    public int secondNumber = 0;
    public String matOperation;

public String getMatPerfomance() {
        Scanner scanner = new Scanner(System.in);
        matOperation = scanner.nextLine();
        switch (matOperation) {
            case "+":
                System.out.println("Plus: " + firstNumber + "+" + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Minus: " + firstNumber + "-" + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Multiply: " + firstNumber + "*" + secondNumber + " = " + ((double) firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Divide: " + firstNumber + "/" + secondNumber + " = " + ((double) firstNumber / secondNumber));
                break;
            case "^": {
                int count = 1;
                int degree = firstNumber;
                while (count != secondNumber) {
                    degree = degree * firstNumber;
                    count++;
                }
                System.out.println("Grade number: " + firstNumber + "^" + secondNumber + " = " + (Math.pow(firstNumber, secondNumber)));
            }
            break;
            case "%":
                System.out.println("Modulo: " + firstNumber + "%" + secondNumber + " = " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Не правильный символ математической операции!");
        }
        return matOperation;
    }
}

