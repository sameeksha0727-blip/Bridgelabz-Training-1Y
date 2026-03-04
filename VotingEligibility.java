package com.gla.level2;

import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++)
            ages[i] = r.nextInt(90);

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVoting(ages);

        System.out.println("Age\tStatus");
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + "\t" + result[i][1]);
    }
}
