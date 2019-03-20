import java.util.Scanner;

public class Calculator {
    int number1 = 0;
    int number2 = 0;
    String result;
    int logic;

    String message() {
        System.out.println("Калькулятор!");
        System.out.print("Введите первое число: ");
        return "";
    }

    String end() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если вы хотите продолжить: 1) да 2) нет");
        logic = scanner.nextInt();
        while (logic == 1) {
            message();
            mat();
            end();
            System.out.println("Если вы хотите продолжить: 1) да 2) нет");
        }
        if (logic == 2) {
            return "exit";
        } else {
            return end();
        }
    }

    String mat() {
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        result = scanner.nextLine();
        String result = scanner.nextLine();
        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();

        switch (result) {
            case "+":
                System.out.println("Plus: " + number1 + "+" + number2 + " = " + (number1 + number2));
                break;
            case "-":
                System.out.println("Minus: " + number1 + "-" + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiply: " + number1 + "*" + number2 + " = " + ((double) number1 * number2));
                break;
            case "/":
                System.out.println("Divide: " + number1 + "/" + number2 + " = " + ((double) number1 / number2));
                break;
            case "^":
                System.out.println("Grade number: " + number1 + "^" + number2 + " = " + (Math.pow(number1, number2)));
                break;
            case "%":
                System.out.println("Modulo: " + number1 + "%" + number2 + " = " + (number1 % number2));
                break;
            default:
                System.out.println("Не корректно");
        }
        return result;
    }
}

