package ru.itsjava.arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyArrays {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        System.out.println("Первый элемент массива: " + numbers[0]);
        System.out.println("Последний элемент массива: " + numbers[numbers.length - 1]);
        int[] numbers2 = new int[]{5, 7, -3, 0, 47};
        int value = -3;
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == value) {
                System.out.println("Порядковый номер элемента " + value + " : " + (++i));
                break;
            }
        }
        System.out.println();
        System.out.println("Домашняя работа по лекции №2");
        //Вывести все элементы массива
        System.out.println("Вывести все элементы массива:");
        int[] numbers3 = new int[]{3, 5, 23, -10, 66, 12, -3};
        for (int s = 0; s < numbers3.length; s++) {
            System.out.print(numbers3[s] + ";");
        }
        System.out.println("");
        //Вывести элементы стоящие на четных индексах
        System.out.println("Выводим элементы стоящие на четных индексах:");
        for (int s = 0; s < numbers3.length; s += 2) {
            System.out.print(numbers3[s] + ";");
        }
        System.out.println("");
        //Вывести массив в обратном порядке
        System.out.println("Выводим массив в обратном порядке");
        for (int s = numbers3.length - 1; s >= 0; s--) {
            System.out.print(numbers3[s] + ";");
        }
        System.out.println();
        //Вывести сумму всех элементов массива
        System.out.println("Выводим сумму всех элементов массива");
        int sum = 0;
        for (int s = 0; s < numbers3.length; s++) {
            sum = sum + numbers3[s];
        }
        System.out.println("Сумма всех элементов массива равна:" + "" + sum);
        System.out.println("");
        //Вывести расчет сумму факториала
        System.out.println("Вывести расчет факториала 10!");
        int n = 10;
        int a = 1;
        int multi = 1;
        while (a <= n) {
            multi *= a;
            a++;
        }
        System.out.println("Факториал 10!=" + multi);
        System.out.println("");
        //Вывести сумму чисел через while
        System.out.println("Вывести сумму цифтр числа 567");
        int number4 = 567;
        int sum1 = 0;
        while (number4 > 0) {
            sum1 = sum1 + number4 % 10;
            number4 = number4 / 10;
        }
        System.out.println("Сумма цифр числа 567: 5+6+7=" + sum1);
        System.out.println("");
        //Вывести элементы массива которые делятся и на 5 и на 3
        int[] numbers5 = new int[]{1, 3, 5, 15, 75, 105, 45};
        printArray(numbers5);
        printArray(arrayOfElemDivBy3And5(numbers5));
//        выводим массив из Домашнего задания номер 2 спомощью  метода
        printArray(numbers3);
//        Выводим элемнты массива стоящие на четных индексах
        printArrayElementOnEvenIndex(numbers3);
//        вывести элементы массива в обратном порядке с помощью метода
        printReversArray(numbers3);
//        вывести сумму всех элементов массива с помощью метода
        printSumAllElementsArray(numbers3);
// вывод расчета факториала через метод
        printCalculaitFactorial(10);
//вывод расчета суммы элементов числа
        printSumOfElementsNumber(567);
//        System.out.println("Данн массив:");
//        for (int l = 0; l < numbers5.length; l++) {
//            System.out.print(numbers5[l] + ";");
//        }
//        System.out.println("");
//        for (int m = 0; m < numbers5.length; m++) {
//            if (numbers5[m] % 3 == 0 && numbers5[m] % 5 == 0) {
//                System.out.print(numbers5[m] + "" + ";");
//            }
//        }

    }

    public static void printArrayElementOnEvenIndex(int[] array) {
        System.out.println("\nВыводим элементы стоящие на четных индексах:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + ";");
        }
    }

    public static void printCalculaitFactorial(int n) {
        System.out.println("\nВывести расчет факториала" + n + "!");
        int a = 1;
        int multi = 1;
        while (a <= n) {
            multi *= a;
            a++;
        }
        System.out.println("Факториал" + n+"!=" + multi);
    }

    public static void printReversArray(int[] array) {
        System.out.println("\nВыводим массив в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ";");
        }
    }

    public static void printSumAllElementsArray(int[] array) {
        System.out.println("\nВыводим сумму всех элементов массива");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех элементов массива равна:" + "" + sum);
    }
public static void printSumOfElementsNumber (int n) {
    System.out.println("\nВывести сумму цифр числа"+n);
    int number4 = n;
    int sum1 = 0;
    while (number4 > 0) {
        sum1 = sum1 + number4 % 10;
        number4 = number4 / 10;
    }
    System.out.println("Сумма цифр числа "+n+" = " + sum1);

}
    public static void printArray(int[] array) {
        System.out.println("\nПечать массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }
    }

    public static int[] arrayOfElemDivBy3And5(int[] array) {
        int lengthResArray = 0;
        for (int m = 0; m < array.length; m++) {
            if (array[m] % 3 == 0 && array[m] % 5 == 0) {
                lengthResArray++;
            }
        }
        int[] resArray = new int[lengthResArray];
        int indexResArray = 0;
        for (int m = 0; m < array.length; m++) {
            if (array[m] % 3 == 0 && array[m] % 5 == 0) {
                resArray[indexResArray] = array[m];
                indexResArray++;
            }
        }
        return resArray;
    }
}


//HW: 1. Вывести все элементы массива
//    2. Вывести все элементы стоящие на четных индексах
//    3. Вывести массив в обратном порядке
//    4. Вывести сумму всех элементов массива
