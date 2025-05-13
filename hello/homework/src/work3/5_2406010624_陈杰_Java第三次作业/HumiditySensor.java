package work3.work5;

public class HumiditySensor implements Sensor{
    @Override
    public void readData() {
        System.out.println("Humidity data read.");
    }
}
