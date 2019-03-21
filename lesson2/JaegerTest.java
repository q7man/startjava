public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModel("Mark2");
        gipsyDanger.getStatus(true);
        gipsyDanger.getSpeed(150);
        gipsyDanger.setHeight(1900);
        gipsyDanger.setReportData();
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModel("Mark5");
        strikerEureka.getStatus(false);
        gipsyDanger.getSpeed(220);
        strikerEureka.setHeight(2100);
        strikerEureka.setReportData();
    }
}
