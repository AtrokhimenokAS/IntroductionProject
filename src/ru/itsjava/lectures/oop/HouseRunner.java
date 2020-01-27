package ru.itsjava.lectures.oop;

public class HouseRunner {

    public static void main(String[] args) {
        House myHouse = new House(5, "wood", 50.5);
        System.out.println(myHouse.getMaterial());
        myHouse.setMaterial("metal");
        System.out.println(myHouse.getMaterial());
        myHouse.printMaterial();

        House aleksandrHouse = new House(512.56);
        System.out.println("Material: " + aleksandrHouse.getMaterial().length());



    }
}
