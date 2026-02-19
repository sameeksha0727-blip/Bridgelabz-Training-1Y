package ridehailing;

public class Bike extends Vehicle {

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

