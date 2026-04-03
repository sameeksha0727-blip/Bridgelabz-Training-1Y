import java.util.ArrayList;

public class SensorLogger {

    public static void addTemperature(ArrayList<Double> list, double value) {
        list.add(value);   // auto-boxing
    }

    public static void printTemperature(Double value) {
        double temp = value;   // auto-unboxing
        System.out.println("Temperature = " + temp);
    }

    public static void main(String[] args) {

        ArrayList<Double> temperatures = new ArrayList<>();

        addTemperature(temperatures, 25.5);
        addTemperature(temperatures, 30.2);
        addTemperature(temperatures, 18.9);

        for (Double t : temperatures) {
            printTemperature(t);
        }
    }
}
