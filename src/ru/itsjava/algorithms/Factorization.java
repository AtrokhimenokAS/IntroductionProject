package ru.itsjava.algorithms;

import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        int num ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число");
        num=sc.nextInt();
        recursion(num);
    }
        public static void recursion (int n){
            int a = 2;
            while (a <= n) {
                if ((n % a) == 0) {
                    if (a != n) {
                        System.out.print(a + " ");
                        recursion(n / a);
                    } else {
                        System.out.print(a);
                    }
                    return;
                }
                a++;
            }
        }

}
