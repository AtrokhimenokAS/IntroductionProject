package ru.itsjava.lectures.oop.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask2 {
    public static void main(String[] args) {
        List<Integer> numberArray = new ArrayList<>();//создание пустого списка

        List<Integer> numberArray1 = new ArrayList<>(20); //создание списка размером 20

        //System.out.println("numberArray1.size() = " + numberArray1.size());

        numberArray1.add(1);
        numberArray1.add(3);
        numberArray1.add(41);
        numberArray1.add(1);
        numberArray1.add(569);
        numberArray1.add(120);
        numberArray1.add(28);
        numberArray1.add(11);
        numberArray1.add(62);
        numberArray1.add(0);
        numberArray1.add(15);
        numberArray1.add(75);
        numberArray1.add(2);
        numberArray1.add(7001);
        numberArray1.add(6);
        numberArray1.add(1000);
        numberArray1.add(98);
        numberArray1.add(55);
        numberArray1.add(6);
        numberArray1.add(32);

        System.out.println("numberArray1.get(0) = " + numberArray1.get(0)); // Получение первого элемента по индексу
        System.out.println("numberArray1.get(numberArray1.size()-1) = "
                + numberArray1.get(numberArray1.size() - 1)); //получение последнего элемента по индексу

        for (int i = 0; i < 5; i++) {
            numberArray1.add((int) (Math.random() * 1000)); // Добавить 5 элементов в конец списка
        }

        numberArray1.add(2, 120);   // Добавить шестой элемент в третию позицию.
        numberArray1.add(0, 28);  // Добавить седьмой элемент в первую позицию.


        List<Integer> numberArray2 = new ArrayList<>();

        numberArray2.addAll(numberArray1); //Записываем в новый список все элементы предыдущего списка.

        numberArray2.remove(Integer.valueOf(41)); //удаление элемента из списка по значению
        for (Integer s : numberArray2) {
            System.out.println(s);
        }
        numberArray2.remove(1); //удаление элемента из списка по индексу
        for (Integer s : numberArray2) {
            System.out.println(s);
        }
        System.out.println("numberArray2.contains(0) = " + numberArray2.contains(0)); //Проверка наличия элемента в списке

        System.out.println(numberArray2.toString()); //вывод списка в строку

        for (int i = 0; i < numberArray2.size(); i++) {   //возвращаем отфильтрованный список по индексу делящемуся на 3
            if (i % 3 == 0 & i != 0) {
                System.out.println(numberArray2.get(i));
            }
        }


        int j = 0;  // возвращаем колличество элементов совпавших с условием
        for (int n : numberArray2) {
            if (n == 6) {
                j++;
            }
        }
        System.out.println("Колличество одинаковых элементов: " + j);

        List<Integer> numberArrayFilter = new ArrayList<>();
        for (int i = 3; i < numberArray2.size(); i++) {
            numberArrayFilter.add(numberArray2.get(i));// пропускаем 3 первых элемента в списке
        }
        System.out.println(numberArrayFilter.toString());

        List<Integer> numberArrayFilter1 = new ArrayList<>();
        j = 0;
        for (Integer i : numberArray2) {
            if (i != 1 || ++j > 2) {      //Пропустить первые 2 элемента, которые равные 1
                numberArrayFilter1.add(i);
            }
        }
        System.out.println(numberArrayFilter1.toString());


        int result = -1;
        for (int i : numberArray2) {  //Возращаем Первый элемент Делящийся на 3
            if (i % 3 == 0) {
                result = i;
                break;                  //выходим из цикла после нахождения такого элемента
            }
        }
        if (result != -1) {
            System.out.println("Первый элемент в списке делящийся на 3 " + result);
        }

        List<Integer> numberArrayFilter2 = new ArrayList<>();
        for (int i : numberArray2) {
            if (i % 3 == 0) {
                numberArrayFilter2.add(i);
            }
        }
        System.out.println(numberArrayFilter2.toString());


        List<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("male", "Никита", 21));
        personArrayList.add(new Person("male", "Николай", 17));
        personArrayList.add(new Person("male", "Евгений", 27));
        personArrayList.add(new Person("male", "Александр", 21));
        personArrayList.add(new Person("male", "Роман", 28));
        personArrayList.add(new Person("male", "Ньяшат", 21));
        personArrayList.add(new Person("female", "Алена", 21));
        personArrayList.add(new Person("female", "Оля", 32));
        personArrayList.add(new Person("female", "Наташа", 40));
        personArrayList.add(new Person("female", "Руслана", 26));


        System.out.println(personArrayList.toString());

        List<Person> personArrayListMan = new ArrayList<>();
        for (Person person : personArrayList) {
            if (person.getGender() == "male" && person.getName().equalsIgnoreCase("Н")&&(person.getAge() >= 18 && person.getAge() < 27)) {
                personArrayListMan.add(person);
            }
        }

            System.out.println(personArrayListMan.toString());




    }
}


