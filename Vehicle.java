package Package1.Generics;

import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private List<T> vehicles = new ArrayList<>();

    public void addVehicle(T v) {
        vehicles.add(v);
    }

    public void showFleet() {
        for (T v : vehicles) {
            System.out.println(v.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());

        trucks.showFleet();
        bikes.showFleet();
    }
}
