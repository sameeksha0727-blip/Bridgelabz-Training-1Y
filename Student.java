package Package2.Collections.CollegeAdmissionSystem;

public class Student implements Comparable<Student> {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return id == ((Student) o).id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(s.marks, this.marks);
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + marks;
    }
}
