package vehiclerental;

import java.util.*;

public class VehicleRentalMain {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("DL01", 2000));
        vehicles.add(new Bike("DL02", 800));

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost (3 days): " +
                    v.calculateRentalCost(3));
        }
    }
}

