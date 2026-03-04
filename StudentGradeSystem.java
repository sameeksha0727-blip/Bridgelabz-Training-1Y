package com.gla.level2;

import java.util.Random;

public class StudentGradeSystem {

    public static int[][] generateMarks(int n) {
        Random r = new Random();
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = r.nextInt(101);

        return marks;
    }

    public static String calculateGrade(double percent) {
        if (percent >= 90) return "A+";
        else if (percent >= 75) return "A";
        else if (percent >= 60) return "B";
        else if (percent >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {

        int students = 5;
        int[][] marks = generateMarks(students);

        System.out.println("Phy Chem Math Total Avg % Grade");

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = avg;

            System.out.println(
                    marks[i][0] + "  " +
                            marks[i][1] + "  " +
                            marks[i][2] + "  " +
                            total + "  " +
                            Math.round(avg * 100.0) / 100.0 + "  " +
                            percent + "  " +
                            calculateGrade(percent)
            );
        }
    }
}
