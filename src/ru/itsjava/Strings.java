package ru.itsjava;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String name = "Александр";
        System.out.println(name + 5);

        if (name.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }

        String[] arrayOfString = new String[3];
        arrayOfString[0] = "Виталик";
        arrayOfString[1] = "алик";
        arrayOfString[2] = "Вита";

        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.println(arrayOfString[i]);
        }

        String[] arrayOfString2 = new String[]{"Строка1", "Строка2", "Строка3"};
        System.out.println();
        for (String element : arrayOfString2) {
            System.out.println(element);
        }

        System.out.println("Ввод с клавиатуры");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);


    }
}

//HW: 1. Переписать все в main через методы
//    2. Поиграть методы (гугл в помощь) CodePoint не надо
//    3. Проект: