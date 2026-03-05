import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;

        String grade;
        String remark;

        if (percentage >= 90) {
            grade = "A";
            remark = "Excellent";
        }
        else if (percentage >= 75) {
            grade = "B";
            remark = "Good";
        }
        else if (percentage >= 50) {
            grade = "C";
            remark = "Average";
        }
        else {
            grade = "F";
            remark = "Fail";
        }

        System.out.println("Average Marks = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remark = " + remark);

        sc.close();
    }
}