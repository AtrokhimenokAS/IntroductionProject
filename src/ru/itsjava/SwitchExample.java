package ru.itsjava;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scann.nextInt();
        switch (year) {
            case 1990:
                System.out.println("1990");
                break;
            case 1991:
                System.out.println(1991);
                break;
            case 1992:
                System.out.println(year);
                break;
        }
    }
}
