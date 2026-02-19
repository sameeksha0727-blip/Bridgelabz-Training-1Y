package com.gla.HierarchicalInheritance;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher | Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student | Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Staff | Department: " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("Riya", 35, "Math");
        Student s = new Student("Aman", 18, "12th");
        Staff st = new Staff("Karan", 40, "Admin");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
