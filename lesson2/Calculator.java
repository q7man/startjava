public class Calculator {
    public int firstNumber;
    public int secondNumber;
    public String matOperation;

    public void Calculate() {
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
                System.out.println("Grade number: " + firstNumber + "^" + secondNumber + " = " + (degree));
                }
                break;
            case "%":
                System.out.println("Modulo: " + firstNumber + "%" + secondNumber + " = " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Uncorret Math Symbol");
        }
    }
}

