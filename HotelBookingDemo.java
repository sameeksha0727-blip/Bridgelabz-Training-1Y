package com.gla.constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // Copy Constructor
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Suhani", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        System.out.println("-----------");
        h2.display();
        System.out.println("-----------");
        h3.display();
    }
}

