package Package2.Collections.RideSharingDispatchSystem;

public class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Ride -> " + request + " assigned to " + driver;
    }
}
