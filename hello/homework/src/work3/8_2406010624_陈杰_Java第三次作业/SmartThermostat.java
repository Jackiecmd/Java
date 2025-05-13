package work3.work8;

public class SmartThermostat extends SmartDevice{
    @Override
    public void activateEcoMode() {
        System.out.println("Temperature set to 20°C (Eco Mode)");
    }
}
