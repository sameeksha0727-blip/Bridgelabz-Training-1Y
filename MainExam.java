package Package2.Collections.OnlineExaminationManagementSystem;

public class MainExam {
    public static void main(String[] args) {

        ExamSystem system = new ExamSystem();

        system.enrollStudent(new Student("S1"));
        system.enrollStudent(new Student("S2"));
        system.enrollStudent(new Student("S1"));

        system.addQuestion(new Question(1, "What is Java?"));
        system.addQuestion(new Question(2, "Explain OOP."));
        system.addQuestion(new Question(3, "What is JVM?"));

        system.shuffleQuestions();

        system.serveStudents();
        system.navigateQuestions();
    }
}
