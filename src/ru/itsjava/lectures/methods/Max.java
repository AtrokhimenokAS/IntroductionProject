package ru.itsjava.lectures.methods;

public class Max {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        printMax(num1, num2);
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public static void printMax(int i1, int i2) {
        System.out.println(Math.max(i1, i2));
        i1 = 8;
    }
}
