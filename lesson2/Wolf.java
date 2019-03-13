public class Wolf {
    String sex = "male wolf";
    String name = "PLuffy";
    String color = "grey";
    int weight = 10;
    int ages = 5;

    boolean eat() {
        System.out.println("Pluffy loves to eat");
        return true;
    }

    int run(int rasstoyanie) {
        int runs = rasstoyanie * 2;
        return runs;
    }

    String bark() {
        return "woof-woof!";
    }
}
