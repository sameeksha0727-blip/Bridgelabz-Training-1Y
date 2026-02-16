package com.gla.constructors;

class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized Constructor
    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}

