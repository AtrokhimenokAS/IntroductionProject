package ru.itsjava;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
//        private void startProgram () {
        boolean exit = false;
        while (!exit) {

            System.out.println(
                    "Выберете пункт меню:" + "\n"
                            + "1. Вывод всех автомобилей" + "\n"
                            + "2. Купить автомобиль" + "\n"
                            + "3. Здать в аренду" + "\n"
                            + "4. Сортировка автомобилей" + "\n"
                            + "5. Водный транспорт" + "\n"
                            + "6. Exit" + "\n"
            );
            Scanner sc = new Scanner(System.in);
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
                System.out.println("Вывод всех автомобилей");
                //действие1
            } else if (menuinput == 2) {
                System.out.println("Купить автомобиль");
                //действие2
            } else if (menuinput == 3) {
                System.out.println("Здать в аренду");
                //действие3
            } else if (menuinput == 4) {
                System.out.println("Сортировка автомобилей");
                //действие3
            } else if (menuinput == 5) {
                System.out.println("Водный транспорт");

            } else if (menuinput == 6) {
                exit = true;
            }
        }
    }
}



