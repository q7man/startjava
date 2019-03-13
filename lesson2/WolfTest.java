public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        System.out.println(wolfy.name + " " + wolfy.sex);
        wolfy.run(100);
        System.out.println(wolfy.run(100) + "kms");
        System.out.println(wolfy.bark() + wolfy.eat());
    }
}
