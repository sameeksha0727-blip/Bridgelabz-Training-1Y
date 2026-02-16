package com.gla.constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental c1 = new CarRental("Suhani", "Swift", 5);
        c1.display();
    }
}

