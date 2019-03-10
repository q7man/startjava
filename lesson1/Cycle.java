public class Cycle {
    public static void main(String[] args) {
         for(int i = 0; i <= 20; i++){
            System.out.println(i);
        }
         int value = 6;
         while(value >= -6){
             System.out.println(value);
             value = value - 2;
         }

        int summ = 9;
        boolean logic;
        do {
            logic = summ % 2 == 1;
            summ = summ + 2;
            if (summ <= 19) {
                System.out.println("From 10 to 20 odd's: " + summ);
            }
        }
        while (summ <= 73);
        System.out.println("Odd's sum: " + summ);
    }
}
