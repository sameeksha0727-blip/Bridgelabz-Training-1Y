package Package2.Collections.HospitalPatientManagementSystem;

public class MainHospital {
    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        Patient p1 = new Patient(1, "Aman");
        Patient p2 = new Patient(2, "Riya");

        system.admit(p1);
        system.admit(p2);

        system.treat();
        system.discharge(p1);

        system.readmit();
    }
}
