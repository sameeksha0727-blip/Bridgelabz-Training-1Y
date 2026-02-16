package com.gla.level3;

import java.util.Random;

public class MatrixOperations {

    public static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static int[][] sub(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] - b[i][j];
        return r;
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    r[i][j] += a[i][k] * b[k][j];
        return r;
    }

    public static void print(int[][] m) {
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = randomMatrix(2,2);
        int[][] B = randomMatrix(2,2);

        System.out.println("Matrix A:");
        print(A);
        System.out.println("Matrix B:");
        print(B);

        System.out.println("Add:");
        print(add(A,B));
        System.out.println("Subtract:");
        print(sub(A,B));
        System.out.println("Multiply:");
        print(mul(A,B));
    }
}

