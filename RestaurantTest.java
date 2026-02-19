package com.gla.HybridInheritance;

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares food.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Raj", 101);
        Worker w2 = new Waiter("Simran", 102);

        w1.performDuties();
        w2.performDuties();
    }
}
