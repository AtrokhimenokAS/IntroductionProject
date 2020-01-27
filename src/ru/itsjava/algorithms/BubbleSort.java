package ru.itsjava.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{-5, 1, -40, 97, 3, -4};
        System.out.println(Arrays.toString(array));
        int temp;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


// O(n^2)
// 1. O(nlogn) Можно быструю сортировку
// 2. Бинарный поиск