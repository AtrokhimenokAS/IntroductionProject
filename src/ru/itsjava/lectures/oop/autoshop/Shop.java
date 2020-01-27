package ru.itsjava.lectures.oop.autoshop;

public class Shop {
    public static void main(String[] args) {
        Auto bmw = new Auto(9998, "BMW", "X5", 2009);
        Auto toyota = new Auto(9562, "Toyota", "Land Cruser", 2005);
        Auto vaz = new Auto(3856, "VAZ", "2105", 1986);
        Auto volkswagen = new Auto(6500, "Volkswagen", "Passat", 1999);
        Auto kia = new Auto(8127, "Kia", "Sorento", 2017);
        Auto[] cars = new Auto[]{bmw, toyota, vaz, volkswagen, kia};

//        System.out.println(toyota.toString());
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println(kia.getCatalogNumber());

        System.out.println(vaz.getModel()+" "+ vaz.getCatalogNumber()+" "+ vaz.getYear());


    }
}