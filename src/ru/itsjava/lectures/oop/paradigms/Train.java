package ru.itsjava.lectures.oop.paradigms;

import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Man man1 = new Man("Боб", 32, 180, 180, "+180");
        Man man2 = new Man("Боб", 32, 180, 180, "+180");
        System.out.println("man1 == man2" + (man1 == man2));

        Man man3 = man1;
        System.out.println("man1==man3 = " + (man1 == man3));

        System.out.println("man1.equals(man2)= " + man1.equals(man2));
        System.out.println("man1.equals(man3)= " + man1.equals(man3));

        Man man4 = new Man("Джордж", 40, 182, 78, "+1789");
        Man man5 = new Man("Алекс", 49, 165, 63, "+15555");
        Man man6 = new Man("Джим", 22, 187, 96, "+16363");
        Man man7 = new Man("Дункан", 65, 172, 69.78, "+17896");
        Man man8 = new Man("Олоф", 99, 180.9, 102.1, "+12222");
        Man man9 = new Man("Ганс", 30, 199.9, 90, "+19632");
        Man man[] = new Man[]{man4, man5, man6, man7, man8, man9};
        System.out.println(Arrays.toString(man));

    }
}
//1.Girl (3 поля)
//2. Пляж equals и hasheCode
//3. Создать несколько объектов мужиков добавить в одни массив. вывести  с помощью Arrays.toString(array)
