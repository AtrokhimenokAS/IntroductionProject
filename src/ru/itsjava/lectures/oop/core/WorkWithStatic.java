package ru.itsjava.lectures.oop.core;

public class WorkWithStatic {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat barsik =  new Cat();
        murzik.setIsLoveMilk(false);
        System.out.println(murzik.getIsLoveMilk());
        System.out.println(barsik.getIsLoveMilk());


    }
}
