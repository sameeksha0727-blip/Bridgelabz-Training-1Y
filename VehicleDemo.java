package com.gla.instancevsclassvariables;

class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 2000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Suhani", "Car");
        v1.displayVehicleDetails();

        System.out.println("------------");
        Vehicle.updateRegistrationFee(3000);

        Vehicle v2 = new Vehicle("Riya", "Bike");
        v2.displayVehicleDetails();
    }
}

