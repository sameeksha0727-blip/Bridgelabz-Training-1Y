package Package2.Collections.CourierDeliveryRoutingSystem;

public class Parcel implements Comparable<Parcel> {
    String id;
    int priority;

    public Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    @Override
    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    @Override
    public String toString() {
        return id + " | Priority: " + priority;
    }
}
