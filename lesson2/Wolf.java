public class Wolf {
    private String sex = "male wolf";
    private String name = "PLuffy";
    private String color = "grey";
    private int weight = 10;
    private int ages = 5;

    public int setAges(int ages) {
        if (ages > 8) {
            System.out.println("Некорретный возраст");
        } else {
            this.ages = ages;
        }
        return ages;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int walking() {
        int walk = 10;
        return walk;
    }

    public boolean sit() {
        return true;
    }

    public int run(int rasstoyanie) {
        int runs = rasstoyanie * 2;
        return runs;
    }

    public String hawl() {
        return "woooo!";
    }

    public boolean hunt() {
        System.out.println("Pluffy loves hunting");
        return true;
    }
}
