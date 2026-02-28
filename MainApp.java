package question1;

import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Suhani", 101);
        Faculty f = new Faculty("Dr. Sharma", "Java");

        s.displayStudent();
        f.displayFaculty();
    }
}
