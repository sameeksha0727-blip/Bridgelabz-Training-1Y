package com.gla.Introduction;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Tommy", 3),
                new Cat("Kitty", 2),
                new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
