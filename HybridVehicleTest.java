package com.gla.HybridInheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging electric vehicle.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle.");
    }
}

public class HybridVehicleTest {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(200, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda");

        ev.charge();
        pv.refuel();
    }
}
