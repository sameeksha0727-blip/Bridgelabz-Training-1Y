package hospital;

import java.util.*;

public class HospitalMain {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(1, "Ravi", 30, 3));
        patients.add(new OutPatient(2, "Anita", 25));

        for (Patient p : patients) {
            p.getPatientDetails();   // Polymorphism
        }
    }
}

