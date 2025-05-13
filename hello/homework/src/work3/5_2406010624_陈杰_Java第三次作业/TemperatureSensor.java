package work3.work5;

public class TemperatureSensor implements Sensor{
    private boolean isHighTemperature;
    public TemperatureSensor(boolean isHighTemperature){
        this.isHighTemperature=isHighTemperature;
    }
public void triggerAlarm(){
    System.out.println("Alarm triggered!");
}

    @Override
    public void readData() {
        if(isHighTemperature){
            triggerAlarm();
            System.out.println("High temperature detected!");
        }else{
            System.out.println("Normal temperature detected!");
        }
    }
}
