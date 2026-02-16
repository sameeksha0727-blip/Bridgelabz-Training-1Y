package com.gla.instancevsclassvariables;

class Course {
    String courseName;
    int duration; // in months
    double fee;

    static String instituteName = "ABC Institute";

    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Python", 4, 12000);

        c1.displayCourseDetails();
        System.out.println("------------");

        Course.updateInstituteName("XYZ Institute");

        c2.displayCourseDetails();
    }
}

