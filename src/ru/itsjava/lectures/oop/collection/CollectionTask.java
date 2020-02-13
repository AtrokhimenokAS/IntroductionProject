package ru.itsjava.lectures.oop.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>(); //создание пустого списка
        System.out.println("people.size() = " + people.size());
        people.ensureCapacity(20);//расширение списка до 20
        people.add("Лена");
        people.add("Валя");
        people.add("Ира");
        people.add("Саша");
        people.add("Вова");
        people.add("Вениами");
        people.add("Женя");
        people.add("Рома");
        people.add("Игнат");
        people.add("Лютик");
        people.add("Лютый");
        people.add("Армен");
        people.add("Оля");
        people.add("Лада");
        people.add("Сергей");
        people.add("Тарас");
        people.add("Лена");
        people.add("Дима");
        people.add("Вера");
        people.add("Надя");
        System.out.println("people.size() = " + people.size());
        System.out.println("people.get(0) = " + people.get(0)); //вывод первого элемента списка
        System.out.println("people.get(people.size()-1) = " + people.get(people.size() - 1));// вывод последнего элемента списка
        people.add("Надя");
        people.add("Семен");
        people.add("Сеня");
        people.add("Вадим");
        people.add("Арина"); //добавление 5-ти элементов подряд
        people.add(2, "Майкл");// добавление элемента в 3-ю позицию.
        System.out.println("people.get(2) = " + people.get(2));
        people.add(0, "АНТОН");//Добавление элемента в первую позицию.
        System.out.println("people.get(0) = " + people.get(0));

        ArrayList<String> people1 = new ArrayList<String>();
        people1.addAll(people);//Добавление всех элементов в новый список
        for (String s : people1) {
            System.out.println(s);
        }                        //Вывод нового списка на консоль

        System.out.println("people1.size() = " + people1.size()); //удаление элемента по значению
        people1.remove("Вадим");
        for (String s : people1) {
            System.out.println(s);
        }
        System.out.println("people1.size() = " + people1.size());

        System.out.println("people1.get(25) = " + people1.get(25));
        people1.remove(25);//удаление элемента по номеру индекса
        for (String s : people1) {
            System.out.println(s);
        }
        System.out.println("people1.size() = " + people1.size());


        boolean checkName = false;   //проверка на наличие в списке
        for (int i = 0; i < people1.size(); i++) {
            if (people1.get(i).equalsIgnoreCase("Иван")) {
                System.out.println(i);
                checkName = true;
            }
        }
        if (!checkName) {
            System.out.println("Иванов нет");
        }
        System.out.println("people1.toString() = " + people1.toString());//вывод списка в строку

        for (int i = 0; i < people1.size(); i++) {   //возвращаем отфильтрованный список по индексу делящемуся на 3
            if (i % 3 == 0 & i != 0) {
                System.out.println(people1.get(i));
            }
        }
        int j = 0; // костыльный вариант
        for (int i = 0; i < people1.size(); i++) {
            if (people1.get(i).equalsIgnoreCase("Надя")) {
               j++;
                //System.out.println(i);
                //checkName = true;
            }
        }
        System.out.println("Колличество одинаковых элементов: "+j);


    }
}
