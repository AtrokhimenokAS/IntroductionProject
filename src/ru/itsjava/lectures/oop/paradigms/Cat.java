package ru.itsjava.lectures.oop.paradigms;

public class Cat extends Animal {
    /*Cat cat=new Cat();
    cat.drinkMilk();*/
    public void catSay() {
        System.out.println("Meow");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

}




