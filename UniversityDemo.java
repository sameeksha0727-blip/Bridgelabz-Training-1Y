package com.gla.accessmodifier;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    void display() {
        System.out.println("Roll: " + rollNumber);   // public
        System.out.println("Name: " + name);         // protected
        System.out.println("CGPA: " + getCGPA());    // private via method
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(101, "Suhani", 8.5);
        p.display();
    }
}

