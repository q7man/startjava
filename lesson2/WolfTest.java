public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        System.out.println(wolfy.name + " " + wolfy.sex);
        System.out.println(wolfy.name + " love walkin " + wolfy.walking() + " hours, every day");
        wolfy.run(100);
        wolfy.sit();
        System.out.println(wolfy.run(100) + "kms");
        System.out.println(wolfy.hawl() + wolfy.hunt());
    }
}
