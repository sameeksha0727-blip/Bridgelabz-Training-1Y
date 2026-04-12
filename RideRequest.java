package Package2.Collections.RideSharingDispatchSystem;

public class RideRequest implements Comparable<RideRequest> {
    int requestId;
    String location;
    int priority;

    public RideRequest(int requestId, String location, int priority) {
        this.requestId = requestId;
        this.location = location;
        this.priority = priority;
    }

    @Override
    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    @Override
    public String toString() {
        return "RequestID: " + requestId + " | " + location + " | Priority: " + priority;
    }
}
