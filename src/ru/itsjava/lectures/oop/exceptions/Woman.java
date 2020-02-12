package ru.itsjava.lectures.oop.exceptions;

public class Woman {
    private String name;
    private int age;
    private  double weight;

    public void setWeight(double weight) {
        if (weight > 60) {
            throw new MyException();
        }
        this.weight = weight;
    }

    public Woman(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;


    }
}
