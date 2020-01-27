package ru.itsjava.lectures.oop;

public class House {
    private int countFloor;
    private String material;
    private double price;

    public House(int countFloor, String material, double price) {
        this.countFloor = countFloor;
        this.material = material;
        this.price = price;
    }

    public House(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void printMaterial() {
        System.out.println(material);
    }

}


//HW 1. set и get для всех полей. И написать все воможные конструкторы для класса House.
//   2. Класс Утка. (3 поля)


