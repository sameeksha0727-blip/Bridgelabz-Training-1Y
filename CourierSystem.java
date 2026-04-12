package Package2.Collections.CourierDeliveryRoutingSystem;

import java.util.*;

public class CourierSystem {

    PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
    Queue<Parcel> normalQueue = new LinkedList<>();
    Set<String> parcelIds = new HashSet<>();
    List<Parcel> completed = new ArrayList<>();

    public void addParcel(Parcel p) {
        if (!parcelIds.add(p.id)) {
            System.out.println("Duplicate Parcel: " + p.id);
            return;
        }

        if (p.priority > 5) {
            priorityQueue.add(p);
        } else {
            normalQueue.add(p);
        }
    }

    public void assignDelivery() {
        System.out.println("\nAssigning Deliveries:");

        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.poll();
            completed.add(p);
            System.out.println("Delivered (Priority): " + p);
        }

        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.poll();
            completed.add(p);
            System.out.println("Delivered: " + p);
        }
    }

    public void showCompleted() {
        System.out.println("\nCompleted Deliveries:");
        completed.forEach(System.out::println);
    }
}
