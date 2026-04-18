package StreamAPI;

import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(25.5, 30.2, 18.7, 35.0);

        double threshold = 25;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(System.out::println);
    }
}
