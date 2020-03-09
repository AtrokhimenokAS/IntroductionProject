package ru.itsjava.enums;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(Seasons.SPRING.name());
        Seasons[] seasonsArray =  Seasons.values();
        System.out.println("seasonsArray[0].name = " + seasonsArray[0].name());

        System.out.println("For each for enum");
        for (Seasons seasons: seasonsArray
             ) {
            System.out.println(seasons.name()+" "+seasons.ordinal());
        }
        System.out.println(Seasons.valueOf("SPRING"));

        Color.values()[0].prettyPrintColorNumber();
        Color.values()[1].prettyPrintColorNumber();

        System.out.println(new Film("Тупой и еще тупее", Genre.COMEDY));
    }
}
