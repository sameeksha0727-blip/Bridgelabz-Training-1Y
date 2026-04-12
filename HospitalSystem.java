package Package2.Collections.HospitalPatientManagementSystem;

import java.util.*;

public class HospitalSystem {

    Set<Patient> admitted = new HashSet<>();
    Queue<Patient> waitingQueue = new LinkedList<>();
    Stack<Patient> dischargedStack = new Stack<>();
    List<Patient> history = new ArrayList<>();

    public void admit(Patient p) {
        if (admitted.add(p)) {
            waitingQueue.add(p);
            history.add(p);
        }
    }

    public void treat() {
        if (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.poll();
            System.out.println("Treating: " + p);
        }
    }

    public void discharge(Patient p) {
        admitted.remove(p);
        dischargedStack.push(p);
        System.out.println("Discharged: " + p);
    }

    public void readmit() {
        if (!dischargedStack.isEmpty()) {
            Patient p = dischargedStack.pop();
            admit(p);
            System.out.println("Re-admitted: " + p);
        }
    }
}
