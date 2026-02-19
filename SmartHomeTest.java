package com.gla.SingleInheritance;

class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String id, String status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T101", "ON", 24);
        t.displayStatus();
    }
}
