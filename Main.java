import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AdminService admin = new AdminService();
        StudentService student = new StudentService();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (admin.login()) {
                        admin.approveRequest();
                    } else {
                        System.out.println("Invalid Login");
                    }
                    break;

                case 2:
                    student.addStudent();
                    student.requestBook();
                    break;
            }

        } while (choice != 3);
    }
}
