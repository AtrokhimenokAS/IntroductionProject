package ru.itsjava.lectures.oop.exceptions;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) throws MyBeautifulExeption {
        if (age < 0){
            throw new MyBeautifulExeption();
        }
            this.age = age;
    }
}
