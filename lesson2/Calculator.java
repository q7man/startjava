import java.util.Scanner;
public class Calculator {
    int firstNumber = 0;
    int secondNumber = 0;
    String matOperation;
    int continueChoose;

    public String matLogic() {
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
            case "^":
                System.out.println("Grade number: " + firstNumber + "^" + secondNumber + " = " + (Math.pow(firstNumber, secondNumber)));
                break;
            case "%":
                System.out.println("Modulo: " + firstNumber + "%" + secondNumber + " = " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Не корректно");
        }
        return matOperation;
    }
}

