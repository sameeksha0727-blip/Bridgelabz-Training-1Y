package com.gla.level2;

import java.util.Scanner;

public class FriendsInfo {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int x : ages) if (x < min) min = x;
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int x : heights) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest age = " + findYoungest(ages));
        System.out.println("Tallest height = " + findTallest(heights));
    }
}

