package ru.itsjava.enums;

public enum Color {
    RED("#1"), YELLOW("#2"), BLUE("#3");
    private String value;

    Color(String value) {
        this.value = value;
    }

    public void prettyPrintColorNumber() {
        System.out.println("Номер Вашего цвета: " + value + ". Поздравляю!");
    }
}
