public class Jaeger {
    private String model;
    private boolean status;
    private int height;
    private int speed;

    public Jaeger(boolean status, int speed) {
        this.status = status;
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void messageAbout() {
        System.out.println("Модель " + model + " ,высота модели " + height + " метров.");
        System.out.println("Статус, уничтожена: " + status + ", скорость: " + speed);
    }
}
