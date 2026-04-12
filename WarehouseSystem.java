package Package2.Collections.WarehouseDeliveryTrackingSystem;

import java.util.*;

public class WarehouseSystem {

    Queue<PackageItem> deliveryQueue = new LinkedList<>();
    Set<String> packageIds = new HashSet<>();
    List<PackageItem> delivered = new ArrayList<>();
    Stack<PackageItem> returned = new Stack<>();

    public void addPackage(PackageItem p) {
        if (packageIds.add(p.id)) {
            deliveryQueue.add(p);
        } else {
            System.out.println("Duplicate Package ID: " + p.id);
        }
    }

    public void processDeliveries() {
        while (!deliveryQueue.isEmpty()) {
            PackageItem p = deliveryQueue.poll();

            if (p.id.endsWith("1")) {
                returned.push(p);
                System.out.println("Returned: " + p);
            } else {
                delivered.add(p);
                System.out.println("Delivered: " + p);
            }
        }
    }

    public void showSummary() {
        System.out.println("\nDelivered:");
        delivered.forEach(System.out::println);

        System.out.println("\nReturned:");
        returned.forEach(System.out::println);
    }
}
