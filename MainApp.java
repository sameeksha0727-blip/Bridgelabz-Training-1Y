public class MainApp {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AC();

        light.turnOn();
        ac.turnOn();
        light.turnOff();
        ac.turnOff();
    }
}
