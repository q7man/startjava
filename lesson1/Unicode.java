public class Unicode {
    public static void main(String[] args) {

        char ca = '\u9398';
        for (int j = 0; j < 780; j++) {
            String sc = String.valueOf(ca);
            System.out.print(sc);
            ca++;
        }
    }
}
