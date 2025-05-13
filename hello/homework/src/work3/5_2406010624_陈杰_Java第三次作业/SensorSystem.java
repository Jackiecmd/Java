package work3.work5;
import java.util.ArrayList;
import java.util.List;

public class SensorSystem {
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new TemperatureSensor(true));
        sensors.add(new HumiditySensor());

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor tempSensor = (TemperatureSensor) sensor;
                tempSensor.readData();
            } else {
                sensor.readData();
            }
        }
    }
}
