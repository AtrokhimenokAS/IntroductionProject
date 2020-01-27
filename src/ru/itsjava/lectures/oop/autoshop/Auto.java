package ru.itsjava.lectures.oop.autoshop;

public class Auto {
    private int catalogNumber;
    private String brand;
    private String model;
    private int year;

    public Auto(int catalogNumber, String brand, String model, int year) {
        this.catalogNumber = catalogNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Номер: " + catalogNumber + " Марка: " + brand + " Модель: " + model + " Год выпуска: " + year;
    }

    public int getCatalogNumber() {
        return catalogNumber;
    }
    public  String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear (){
        return year;
    }

}
