public class Employee {

    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}
