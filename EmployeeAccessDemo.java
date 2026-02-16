package com.gla.accessmodifier;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double sal) {
        this.employeeID = id;
        this.department = dept;
        this.salary = sal;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void display() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department);  // protected
        System.out.println("Salary: " + getSalary());     // private via getter
    }
}

public class EmployeeAccessDemo {
    public static void main(String[] args) {
        Manager m = new Manager(501, "IT", 60000);
        m.setSalary(65000);
        m.display();
    }
}

