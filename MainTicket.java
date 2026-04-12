package Package2.Collections.EventTicketReservationSystem;

public class MainTicket {
    public static void main(String[] args) {

        TicketSystem system = new TicketSystem();

        system.registerUser("Aman");
        system.registerUser("Riya");
        system.registerUser("Aman");

        system.addBooking(new Booking("Aman", false));
        system.addBooking(new Booking("Riya", true));

        system.processBookings();
    }
}
