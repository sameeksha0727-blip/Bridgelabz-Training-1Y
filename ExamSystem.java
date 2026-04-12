package Package2.Collections.OnlineExaminationManagementSystem;

import java.util.*;

public class ExamSystem {

    List<Question> questions = new ArrayList<>();
    Set<String> studentIds = new HashSet<>();
    Queue<Student> studentQueue = new LinkedList<>();
    Stack<Question> navigationStack = new Stack<>();

    public void enrollStudent(Student s) {
        if (studentIds.add(s.studentId)) {
            studentQueue.add(s);
        } else {
            System.out.println("Duplicate student: " + s.studentId);
        }
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public void serveStudents() {
        System.out.println("\nServing Students:");

        while (!studentQueue.isEmpty()) {
            Student s = studentQueue.poll();
            System.out.println("Student taking exam: " + s);
        }
    }

    public void navigateQuestions() {
        System.out.println("\nNavigating Questions:");

        for (Question q : questions) {
            System.out.println("Viewing: " + q);
            navigationStack.push(q);
        }

        System.out.println("\nGoing Back:");
        while (!navigationStack.isEmpty()) {
            System.out.println("Back to: " + navigationStack.pop());
        }
    }
}
