package work3.work8;

public class Application {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();

        // 调用节能模式方法，体现多态
        light.activateEcoMode();
        thermostat.activateEcoMode();
    }
}
