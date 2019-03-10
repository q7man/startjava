public class Calculate {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        char summ = 6;
        if (summ == 1){
            System.out.println("Plus: " +a+ "+" +b+ " = " + (a + b));
        }        else if (summ == 2){
            System.out.println("Minus: " +a+ "-" +b+ " = " + (a - b));
        }        else if (summ == 3){
            System.out.println("Multiply: " +a+ "*" +b+ " = " + ((double)a * b));
        }        else if (summ == 4){
            System.out.println("Divide: " +a+ "/" +b+ " = " + ((double)a / b));
        }        else if (summ == 5){
            System.out.println("Grade number: " +a+ "grade" +b+ " = " + (Math.pow(a, 4)));
        }        else if (summ == 6){
            System.out.println("Modulo: " +a+ "%" +b+ " = " + (a%b));
        }        else {
            System.out.println("Uncorrect");
        }
    }
}
