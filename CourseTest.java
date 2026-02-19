package com.gla.MultilevelInheritance;

class Course {
    protected String courseName;
    protected int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hrs");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Fee after Discount: " + finalFee);
    }
}

public class CourseTest {
    public static void main(String[] args) {
        PaidOnlineCourse course =
                new PaidOnlineCourse("Java OOP", 40,
                        "Udemy", true, 5000, 20);

        course.displayCourse();
    }
}
