package work3.work8;

public class SmartLight extends SmartDevice{
    @Override
    public void activateEcoMode() {
        System.out.println("Light brightness reduced to 50%");
    }
}
