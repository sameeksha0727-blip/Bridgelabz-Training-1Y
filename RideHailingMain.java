package ridehailing;

import java.util.*;

public class RideHailingMain {
    public static void main(String[] args) {

        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car(1, "Arjun", 15));
        rides.add(new Bike(2, "Kiran", 10));

        for (Vehicle v : rides) {
            System.out.println("Fare for 10 km: " +
                    v.calculateFare(10));   // Polymorphism
        }
    }
}

