package Package2.Collections.RideSharingDispatchSystem;

public class MainRide {
    public static void main(String[] args) {

        RideSystem system = new RideSystem();

        system.addDriver(new Driver(1, "Aman"));
        system.addDriver(new Driver(2, "Riya"));

        system.addRequest(new RideRequest(101, "CityA", 2));
        system.addRequest(new RideRequest(102, "CityB", 5));
        system.addRequest(new RideRequest(103, "CityC", 1));

        system.assignRides();
        system.showCompletedRides();
    }
}
