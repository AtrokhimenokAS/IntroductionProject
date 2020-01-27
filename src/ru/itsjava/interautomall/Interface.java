package ru.itsjava.interautomall;

import java.util.Arrays;
import java.util.Scanner;

public class Interface {
    private static int realSize = 0;

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String[][] matrixCar;
        realSize = 10;
        matrixCar = new String[realSize][5];
        matrixCar[0][0] = "9562";
        matrixCar[0][1] = "Toyota";
        matrixCar[0][2] = "Land Cruser";
        matrixCar[0][3] = "2005";
        matrixCar[0][4] = "false";
        matrixCar[1][0] = "1564";
        matrixCar[1][1] = "Alfa Romeo";
        matrixCar[1][2] = "S500";
        matrixCar[1][3] = "1996";
        matrixCar[1][4] = "false";
        matrixCar[2][0] = "3856";
        matrixCar[2][1] = "VAZ";
        matrixCar[2][2] = "2105";
        matrixCar[2][3] = "1986";
        matrixCar[2][4] = "false";
        matrixCar[3][0] = "6500";
        matrixCar[3][1] = "Voltswagen";
        matrixCar[3][2] = "Passat";
        matrixCar[3][3] = "1999";
        matrixCar[3][4] = "false";
        matrixCar[4][0] = "15";
        matrixCar[4][1] = "ГАЗ";
        matrixCar[4][2] = "Волга";
        matrixCar[4][3] = "2001";
        matrixCar[4][4] = "false";
        matrixCar[5][0] = "8127";
        matrixCar[5][1] = "Kia";
        matrixCar[5][2] = "Sorento";
        matrixCar[5][3] = "2017";
        matrixCar[5][4] = "false";
        matrixCar[6][0] = "5005";
        matrixCar[6][1] = "Иж";
        matrixCar[6][2] = "Ода";
        matrixCar[6][3] = "2000";
        matrixCar[6][4] = "false";
        matrixCar[7][0] = "700";
        matrixCar[7][1] = "Hyundai";
        matrixCar[7][2] = "Solaris";
        matrixCar[7][3] = "2014";
        matrixCar[7][4] = "false";
        matrixCar[8][0] = "9998";
        matrixCar[8][1] = "BMW";
        matrixCar[8][2] = "X5";
        matrixCar[8][3] = "2009";
        matrixCar[8][4] = "false";
        matrixCar[9][0] = "1";
        matrixCar[9][1] = "Mersedes";
        matrixCar[9][2] = "E220";
        matrixCar[9][3] = "2015";
        matrixCar[9][4] = "false";
        boolean isExit = false;
        int key;
        while (!isExit) {
            printMenu();
            key = sc1.nextInt();
            switch (key) {
                case 1:
                    printTableAllCars(matrixCar);
                    break;
                case 2:
                    printMenuBuyAndSoldCar();
                    matrixCar = menuBuyAndSoldCar(sc1, matrixCar);
                    break;
                case 3:
                    System.out.println("Выберите автомобиль");
                    printTableAllCars(matrixCar);
                    printMenuRentCar();
                    matrixCar = menuRentCar(matrixCar, sc1);
                    break;
                case 4:
                    printTableAllCars(matrixCar);
                    printSortCarMenu();
                    carSort(matrixCar, sc1);
                    break;
                case 0:
                    System.out.println("Ждем вас снова");
                    isExit = true;
                    break;
                default:
                    printMenu();
            }
//
        }
        sc1.close();
    }

    private static void printMenu() {
        System.out.println("Добро пожаловать в 'INTERAUTOMALL'" +
                "Выберете пункт меню:" + "\n"
                + "1. Автомобилей в наличие" + "\n"
                + "2. Купить/Продать автомобиль" + "\n"
                + "3. Взять машину в аренду" + "\n"
                + "4. Сортировка автомобилей" + "\n"
                + "0. Exit" + "\n"
        );
    }

    private static void printMenuBuyAndSoldCar() {
        System.out.println("Покупка/Продажа автомобиля\n" +
                "Выберите пункт меню:" + "\n"
                + "1. Купить автомобиль" + "\n"
                + "2. Продать автомобиль" + "\n"
                + "3. Оставить контактные данные для связи" + "\n"
                + "0. Вернуться в предыдущее Меню"
        );
    }

    private static String[][] menuBuyAndSoldCar(Scanner scanner, String[][] matrixCar) {
        boolean isExit = false;
        int key;
        while (!isExit) {
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Введите каталожный номер автомобиля:");
                    int carNumber = scanner.nextInt();
                    int i;
                    for (i = 0; i < realSize; i++) {
                        if (Integer.parseInt(matrixCar[i][0]) == carNumber) {
                            if (Boolean.parseBoolean(matrixCar[i][4])) {
                                System.out.println("К сожалению на данный момент автомобиль находится в аренде" +
                                        " и не доступен для покупки. Попрорбуйте позднее. Приносим наши извинениея.\n" +
                                        "Нажмите '0' для выхода в основное Меню.");
                                break;
                            } else {
                                System.out.println("|" + matrixCar[i][0] + "|" + matrixCar[i][1] + "|" + matrixCar[i][2] + "|" + matrixCar[i][3] +
                                        "\nДоступен для покупки.");
                                System.out.println("Введите Вашу фамилию:");
                                String userSecondName = scanner.next();
                                System.out.println("Введите Ваше Имя:");
                                String userFestName = scanner.next();
                                System.out.println("Введите Ваше Отчество:");
                                String userLastName = scanner.next();
                                System.out.println("Введите паспорт серия:");
                                int passportSerial = scanner.nextInt();
                                System.out.println("Введите номер паспорта:");
                                int passportNumber = scanner.nextInt();
                                System.out.println("Введите номер Вашей карты:");
                                String creditCardNumber = scanner.next();
                                System.out.println("Введите код CVV:");
                                System.out.println(userSecondName + " " + userFestName + " " + userLastName + "\n"
                                        + "Паспорт серия " + passportSerial + " № " + passportNumber + "\n"
                                        + "Карта № " + creditCardNumber + "\n"
                                        + "Поздравляем Вас с приобритение автомобиля каталожный номер: " + carNumber + "\n"
                                        + "Удачи на Дорогах!\n"
                                        + "\n"
                                        + "Для возврата в основное Меню нажмите '0'\n");
                                matrixCar[i] = null;
                                realSize--;

                            }

                        }
                    }
                    if (i == realSize) {
                        System.out.println("Извините, такого автомобиля не обнаруженно!\n"+
                                "Для возврата в основное Меню нажмите '0'");
                        break;
                    }

                    break;
                case 2:
                    matrixCar = addArraysString(matrixCar, scanner);
                    printTableAllCars(matrixCar);
                    break;
                case 3:
                    System.out.println("Введите свою Фаимилию:");
                    String userSecondName2 = scanner.next();
                    System.out.println("Введите свое Имя:");
                    String userFistName2 = scanner.next();
                    System.out.println("Введите свое отчество:");
                    String userLastName2 = scanner.next();
                    System.out.println("Ваш E-Mail:");
                    String eMail = scanner.next();
                    System.out.println("Введите Ваш контактный телефон для связи: +7");
                    String phoneNumber = scanner.next();
                    System.out.println("\n" + userSecondName2 + " " + userFistName2 + " " + userLastName2 + "\n"
                            + "с Вами свяжуться наши специалисты по номеру телефона +7" + phoneNumber + ",\n"
                            + "или по E-mail:" + eMail + "\n" +
                            "\n"
                            + "Для возврата в основное Меню нажмите '0'");


                case 0:
                    isExit = true;
                    break;
            }
        }

        return matrixCar;
    }

    public static String[][] menuRentCar(String[][] matrix, Scanner scanner) {
        boolean isExit = false;
        int key;
        while (!isExit) {
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    sortMatrixCarByIntValue(matrix, 0);
                    String format = "|%1$-15s|%2$-16s|%3$-16s|%4$-16s\n";
                    System.out.format(format, "Номер в каталоге", "          Марка", "         Модель ", "       Год выпуска");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length - 1; j++) {
                            System.out.printf("|%15s ", matrix[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("Выберите и введите каталожный номер автомобиля");
                    int carNumber = scanner.nextInt();
                    int i;
                    for (i = 0; i < realSize; i++) {
                        boolean rent = Boolean.parseBoolean(matrix[i][4]);
                        if (Integer.parseInt(matrix[i][0]) - carNumber == 0 && rent == false) {
                            System.out.println("Автомобиль \n" + matrix[i][0] + " | " + matrix[i][1] + " | " + matrix[i][2] + " | " + matrix[i][3] + "\n доступен для аренды. минимальный срок аренды 24 часа.\n"
                                    + "Для продолжения оформления заказа аренды, введите Ваш стаж вождения (количество лет):");
                            break;
                        }


                    }
                    if (i == realSize) {
                        System.out.println("Такой автомобиль не найден или находится в аренде. Попробуйте позднее.\n" +
                                "Нажмите '0' для выхода в основное Меню");
                        break;
                    }
                    int drivingExpirienc = scanner.nextInt();
                    if (drivingExpirienc < 3) {
                        System.out.println("К сожалению Вашего стажа не хватает для продолжения оформления аренды автомобиля.\n"
                                + "Приносим свои извинения.\n"
                                + "Для завершения нажмите '0'");
                    }
                    matrix[i][4] = "true";
                    System.out.println("Введите сериный номер водительского удоствоерения:");
                    int idDriverLicensi = scanner.nextInt();
                    System.out.println("Введите Вашу Фамилию:");
                    String driverSecondName = scanner.next();
                    System.out.println("Ввдите Ваше Имя:");
                    String driverFistName = scanner.next();
                    System.out.println("Введите Ваше Отчество:");
                    String driverLastName = scanner.next();
                    System.out.println("Введите номер телефона для связи: +7");
                    String driverPhoneNumber = scanner.next();
                    System.out.println("\n"
                            + driverSecondName + " " + driverFistName + " " + driverLastName + "\n"
                            + "Наш специалист свяжется с Вами по готовности автомобиля " + idDriverLicensi + "\n"
                            + "По номеру телефона: +7" + driverPhoneNumber + "\n"
                            + "\n" + "Хорошей дороги!\n"
                            + "Для завершения нажмите '0'");


                    break;
                case 2:
                    System.out.println("Введите свою Фаимилию:");
                    String userSecondNameForBackCall = scanner.next();
                    System.out.println("Введите свое Имя:");
                    String userFistNameForBackCall = scanner.next();
                    System.out.println("Введите свое отчество:");
                    String userLastNameForBackCall = scanner.next();
                    System.out.println("Ваш E-Mail:");
                    String eMail = scanner.next();
                    System.out.println("Введите Ваш контактный телефон для связи: +7");
                    String phoneNumber = scanner.next();
                    System.out.println("\n" + userSecondNameForBackCall + " " + userFistNameForBackCall + " " + userLastNameForBackCall + "\n"
                            + "с Вами свяжуться наши специалисты по номеру телефона +7" + phoneNumber + ",\n"
                            + "или по E-mail:" + eMail + "\n" +
                            "\n"
                            + "Для возврата в основное Меню нажмите '0'");
                case 0:
                    isExit = true;
            }
        }
        return matrix;
    }

    private static void printMenuRentCar() {
        System.out.println("'Арнедовать автомобиль'" +
                "Выберите пункт Меню:\n"
                + "1. Оформинт аренду автомобиля\n"
                + "2. Оставить свои контакты\n"
                + "0. Вернуться в основное Меню");
    }

    public static void carSort(String[][] matrixCar, Scanner scanner) {
        boolean isExit = false;
        int key;
        while (!isExit) {
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    matrixCar = sortMatrixCarByIntValue(matrixCar, 0);
                    String format = "|%1$-15s|%2$-16s|%3$-16s|%4$-16s\n";
                    System.out.format(format, "Номер в каталоге", "          Марка", "         Модель ", "       Год выпуска");
                    for (int i = 0; i < matrixCar.length; i++) {
                        for (int j = 0; j < matrixCar[0].length - 1; j++) {
                            System.out.printf("|%15s ", matrixCar[i][j]);
                        }
                        System.out.println();
                    }
                    printSortCarMenu();
                    break;
                case 2:
                    matrixCar = sortMatrixCarByStringValue(matrixCar, 1);
                    format = "|%1$-15s|%2$-16s|%3$-16s|%4$-16s\n";
                    System.out.format(format, "Номер в каталоге", "          Марка", "         Модель ", "       Год выпуска");
                    for (int i = 0; i < matrixCar.length; i++) {
                        for (int j = 0; j < matrixCar[0].length - 1; j++) {
                            System.out.printf("|%15s ", matrixCar[i][j]);
                        }
                        System.out.println();
                    }
                    printSortCarMenu();
                    break;
                case 3:
                    matrixCar = sortMatrixCarByIntValue(matrixCar, 3);
                    format = "|%1$-15s|%2$-16s|%3$-16s|%4$-16s\n";
                    System.out.format(format, "Номер в каталоге", "          Марка", "         Модель ", "       Год выпуска");
                    for (int i = 0; i < matrixCar.length; i++) {
                        for (int j = 0; j < matrixCar[0].length - 1; j++) {
                            System.out.printf("|%15s ", matrixCar[i][j]);
                        }
                        System.out.println();
                    }
                    printSortCarMenu();
                    break;
                case 0:
                    isExit = true;
                    break;
            }
        }
    }


    public static String[][] sortMatrixCarByIntValue(String[][] matrix, int column) {
        String[] temp;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length - j - 1; i++) {
                if ((matrix[i] != null) && (Integer.parseInt(matrix[i][column]) - Integer.parseInt(matrix[i + 1][column]) > 0)) {
                    temp = matrix[i];
                    matrix[i] = matrix[i + 1];
                    matrix[i + 1] = temp;
                }
            }
        }
        return matrix;
    }

    public static String[][] sortMatrixCarByStringValue(String[][] matrix, int column) {
        String[] temp;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length - j - 1; i++) {
                if (matrix[i][column].compareTo(matrix[i + 1][column]) > 0) {
                    temp = matrix[i];
                    matrix[i] = matrix[i + 1];
                    matrix[i + 1] = temp;
                }
            }
        }
        return matrix;
    }

    public static void printSortCarMenu() {
        System.out.println("\nВыберете пункт Меню:\n" +
                "1. По каталожному номеру\n" +
                "2. По маркам\n" +
                "3. По году выпуска\n" +
                "0. Основное Меню.\n");
    }


    public static void printTableAllCars(String[][] matrixCar) {
        System.out.println("'Автомобили в наличие'\n");
        String format = "|%1$-15s|%2$-16s|%3$-16s|%4$-16s\n";
        System.out.format(format, "Номер в каталоге", "          Марка", "         Модель ", "       Год выпуска");
        for (int i = 0; i < realSize; i++) {
            for (int j = 0; j < matrixCar[0].length - 1; j++) {
                System.out.printf("|%15s ", matrixCar[i][j]);
            }
            System.out.println();
        }
    }

    public static String[][] addArraysString(String[][] matrix, Scanner scanner) {
        if (realSize == matrix.length) {
            matrix = Arrays.copyOf(matrix, matrix.length + 1);
        }

        System.out.println("Введите каталожный номер автомобиля");
        matrix[realSize] = new String[5];
        matrix[realSize][0] = scanner.next();
        System.out.println("Введите марку автомобиля");
        matrix[realSize][1] = scanner.next();
        System.out.println("Введите модель автомобля");
        matrix[realSize][2] = scanner.next();
        System.out.println("Введите год выпуска автомобиля");
        matrix[realSize][3] = scanner.next();
        matrix[realSize][4] = "false";
        realSize++;
        return matrix;

    }

}