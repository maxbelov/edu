package com.hackerrank.arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[length - i - 1] = scanner.nextInt();
        }

        IntStream.range(0, length).forEach(i -> System.out.print(reversed[i] + " "));
    }
}
