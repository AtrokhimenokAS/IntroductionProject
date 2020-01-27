package ru.itsjava.algorithms;

import java.util.Arrays;

public class QuickSort {
    public QuickSort() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{55, 16, 2, -9, 4, 66, -50, 1, 0, 100, 35, -5};
        System.out.println("Дан массив");
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int half = left + (right - left) / 2;
        int o = array[half];

        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < o) {
                i++;
            }
            while (array[j] > o) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }
}