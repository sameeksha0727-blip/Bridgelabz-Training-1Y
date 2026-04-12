package Package2.Collections.RideSharingDispatchSystem;

import java.util.*;

public class RideSystem {

    Queue<RideRequest> requestQueue = new LinkedList<>();
    PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
    Set<Driver> availableDrivers = new HashSet<>();
    List<Ride> completedRides = new ArrayList<>();

    public void addRequest(RideRequest r) {
        requestQueue.add(r);
        priorityQueue.add(r);
    }

    public void addDriver(Driver d) {
        availableDrivers.add(d);
    }

    public void assignRides() {
        System.out.println("\nAssigning Rides:");

        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = priorityQueue.poll();

            Driver driver = availableDrivers.iterator().next();
            availableDrivers.remove(driver);

            Ride ride = new Ride(req, driver);
            completedRides.add(ride);

            System.out.println(ride);
        }
    }

    public void showCompletedRides() {
        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}