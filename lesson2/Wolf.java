public class Wolf {
    String sex = "male wolf";
    String name = "PLuffy";
    String color = "grey";
    int weight = 10;
    int ages = 5;

    int walking() {
        int walk = 10;
        return walk;
    }

    boolean sit() {
        return true;
    }

    int run(int rasstoyanie) {
        int runs = rasstoyanie * 2;
        return runs;
    }

    String hawl() {
        return "woooo!";
    }

    boolean hunt() {
        System.out.println("Pluffy loves hunting");
        return true;
    }
}
