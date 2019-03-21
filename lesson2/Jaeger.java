public class Jaeger {
    private String model;
    private boolean status;
    private int height;
    private int speed;

    public int getSpeed(int modelSpeed){
        speed = modelSpeed;
        return speed;
    }

    public boolean getStatus(boolean statusmodel){
        status = statusmodel;
        return status;
    }

    public void setModel(String modelName) {
        model = modelName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setReportData() {
        System.out.println("Модель: " + model + ". высота модели " + height + " метров.");
        System.out.println("Статус: уничтожена. " + status + ". скорость: " + speed);
    }
}
