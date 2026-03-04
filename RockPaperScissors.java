package com.gla.level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = (int)(Math.random() * 3);
        return choices[index];
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp))
            return 0;
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
                (user.equals("Paper") && comp.equals("Rock")) ||
                (user.equals("Scissors") && comp.equals("Paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = computerChoice();

            int result = findWinner(user, comp);

            if (result == 1) userWins++;
            else if (result == -1) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);

        sc.close();
    }
}
