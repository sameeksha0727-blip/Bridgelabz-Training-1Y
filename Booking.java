package Package2.Collections.EventTicketReservationSystem;

public class Booking implements Comparable<Booking> {
    String user;
    boolean vip;

    public Booking(String user, boolean vip) {
        this.user = user;
        this.vip = vip;
    }

    @Override
    public int compareTo(Booking b) {
        return Boolean.compare(b.vip, this.vip);
    }

    @Override
    public String toString() {
        return user + (vip ? " (VIP)" : "");
    }
}
