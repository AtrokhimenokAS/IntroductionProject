package ru.itsjava.objectPractice;

public class Bakery {
    public static void main(String[] args) {
        Cake myCake = new Cake();
        myCake.setName("Наполеон");
        myCake.setWeight(3.5);
        System.out.println(myCake);
        System.out.println(myCake.toString());

    }
}
