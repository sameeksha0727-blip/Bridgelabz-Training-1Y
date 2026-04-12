package Package2.Collections.CollegeAdmissionSystem;

import java.util.*;

public class AdmissionSystem {

    List<Student> applicants = new ArrayList<>();
    Set<Student> shortlisted = new HashSet<>();
    Queue<Student> interviewQueue = new LinkedList<>();
    TreeSet<Student> meritList = new TreeSet<>();

    public void addApplicant(Student s) {
        applicants.add(s);
    }

    public void shortlist(double cutoff) {
        for (Student s : applicants) {
            if (s.marks >= cutoff) {
                shortlisted.add(s);
                interviewQueue.add(s);
            }
        }
    }

    public void conductInterviews() {
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            meritList.add(s);
        }
    }

    public void showMeritList() {
        System.out.println("\nMerit List:");
        for (Student s : meritList) {
            System.out.println(s);
        }
    }
}
