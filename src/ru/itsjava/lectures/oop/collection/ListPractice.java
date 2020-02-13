package ru.itsjava.lectures.oop.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Александр");
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.contains(\"Александр\") = " + arrayList.contains("Александр"));
        //System.out.println("arrayList.remove(0) = " + arrayList.remove(0));
        //System.out.println("arrayList.get(0) = " + arrayList.get(0));
        //arrayList.clear();
        System.out.println("arrayList.get(0) = " + arrayList.get(0));

        arrayList.add("Александр");
        arrayList.add("Виталий");
        arrayList.add("Дмитрий");
        //arrayList.add("Иван");
        // arrayList.add("иван");

        System.out.println("Вывод списка (for)");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        // for (String s : arrayList) {
        //    System.out.println(s);
        // }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
        boolean checkName = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equalsIgnoreCase("Иван")) {
                System.out.println(i);
                checkName = true;
            }
        }
        if (!checkName) {
            System.out.println("Иванов нет");
        }

        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(22);
        integerArrayList.add(100);
        integerArrayList.add(3);
        integerArrayList.add(1);
        integerArrayList.add(1);

    }
}

//Задача 1:
//Выввести ввсе элементы списка в обратном порядке.
//Задача 2:
//Найти элементы