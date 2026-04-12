package Package2.Collections.RideSharingDispatchSystem;

public class Driver {
    int driverId;
    String name;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        return driverId == ((Driver) o).driverId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(driverId);
    }

    @Override
    public String toString() {
        return "Driver " + driverId + " - " + name;
    }
}
