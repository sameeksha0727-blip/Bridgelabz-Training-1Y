public class EngineeringStudent extends Student {

    private String branch;

    public EngineeringStudent(int rollNo, String name, double marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
    }

    @Override
    public String calculateGrade() {
        return super.calculateGrade() + " - " + branch;
    }
}
