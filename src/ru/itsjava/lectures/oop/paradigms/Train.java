package ru.itsjava.lectures.oop.paradigms;

public class Train {
    public static void main(String[] args) {
        Man man1 = new Man("Боб",32,180,180,"+180" );
        Man man2 = new Man("Боб",32,180,180,"+180" );
        System.out.println("man1 == man2"+(man1 == man2));

        Man man3 = man1;
        System.out.println("man1==man3 = " + (man1 == man3));

        System.out.println("man1.equals(man2)= "+man1.equals(man2));
        System.out.println("man1.equals(man3)= "+man1.equals(man3));
    }
}
//1.Girl (3 поля)
//2. Пляж equals и hasheCode
//3. Создать несколько объектов мужиков добавить в одни массив. вывести  с помощью Arrays.toString(array)
