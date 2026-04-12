package Package2.Collections.CollegeAdmissionSystem;

public class MainAdmission {
    public static void main(String[] args) {

        AdmissionSystem system = new AdmissionSystem();

        system.addApplicant(new Student(1, "Aman", 85));
        system.addApplicant(new Student(2, "Riya", 92));
        system.addApplicant(new Student(3, "Raj", 70));

        system.shortlist(80);
        system.conductInterviews();
        system.showMeritList();
    }
}
