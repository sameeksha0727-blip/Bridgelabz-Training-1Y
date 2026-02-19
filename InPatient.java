package hospital;

import java.util.*;

public class InPatient extends Patient implements MedicalRecord {

    private int days;
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.days = days;
    }

    public double calculateBill() {
        return days * 2000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println(records);
    }
}

