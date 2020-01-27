package ru.itsjava.algorithms;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        if (num < 0) {
            System.err.print("Ввели некорректное (отрицательное) число");
        } else {
            System.out.println("Факториал числа " + num + ": " + factorial(num));
        }
        scanner.close();
    }

    private static int factorial(int num) {
        if ((num == 1) || (num == 0)) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}