package com.hackerrank.arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array2D {

    private static final int MAX = 6;
    private static final int HOURGLASS_WIDTH = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[MAX][MAX];
        IntStream.range(0, MAX * MAX).forEach(i -> matrix[i / MAX][i % MAX] = scanner.nextInt());

        System.out.println(getMaxHourglassSum(matrix));
    }

    static int getMaxHourglassSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= MAX - HOURGLASS_WIDTH; i++) {
            for (int j = 0; j <= MAX - HOURGLASS_WIDTH; j++) {
                final int sum = getHourglassSum(i, j, matrix);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static int getHourglassSum(int i, int j, int[][] matrix) {
        int sum = 0;
        for (int k = 0; k < HOURGLASS_WIDTH; k++) {
            sum += matrix[i][j + k];
            sum += matrix[i + HOURGLASS_WIDTH - 1][j + k];
        }
        sum += matrix[i + 1][j + 1];
        return sum;
    }
}
