import java.util.Scanner;

public class FriendsAgeHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar age and height: ");
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar age and height: ");
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony age and height: ");
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        if (youngestAge == amarAge)
            System.out.println("Amar is youngest");
        else if (youngestAge == akbarAge)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        if (tallestHeight == amarHeight)
            System.out.println("Amar is tallest");
        else if (tallestHeight == akbarHeight)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");

        sc.close();
    }
}