package ru.itsjava.objectPractice;

public class Cake {
    private String name;
    private double weight;
    private boolean isSweet;

    public Cake() {

    }

    public Cake(String name, double weight, boolean isSweet) {
        this.name = name;
        this.weight = weight;
        this.isSweet = isSweet;

    }

    public Cake(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

   @Override
    public String toString() {
        return name +" "+weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
