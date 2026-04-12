package Package2.Collections.EventTicketReservationSystem;

import java.util.*;

public class TicketSystem {

    List<Booking> bookings = new ArrayList<>();
    Set<String> users = new HashSet<>();
    Queue<Booking> queue = new LinkedList<>();
    PriorityQueue<Booking> vipQueue = new PriorityQueue<>();

    public void registerUser(String user) {
        if (!users.add(user)) {
            System.out.println("Duplicate user: " + user);
        }
    }

    public void addBooking(Booking b) {
        queue.add(b);
        vipQueue.add(b);
    }

    public void processBookings() {
        System.out.println("\nProcessing Bookings:");

        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            bookings.add(b);
            System.out.println("Confirmed: " + b);
        }
    }
}
