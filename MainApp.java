package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Suhani", 101);
        Faculty f = new Faculty("Dr. Mehta", "Data Structures");
        Department d = new Department("Computer Science");

        System.out.println("---- College Information ----");
        s.display();
        f.display();
        d.display();
    }
}
