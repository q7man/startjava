public class Unicode {
    public static void main(String[] args) {
        int uc = 9398;
        char cu = (char) uc;
        for (int j = 0; j < 780; j++) {
            System.out.print(cu);
            cu++;
        }
    }
}
