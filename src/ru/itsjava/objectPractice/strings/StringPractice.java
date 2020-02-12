package ru.itsjava.objectPractice.strings;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Я замечательная строка";
        String str2 = "Я замечательная строка";
        System.out.println(str == str2);
        //создание явно строки вне пула
        String str3 = new String("Я замечательная строка");
        System.out.println(str == str3);

        str3 = str3.intern();
        System.out.println(str == str3);

        String bad= "Bad";
        for (int i = 0; i <10000 ; i++) {
            bad=bad+i;

        }
        System.out.println(bad);

        StringBuilder goodBuilder = new StringBuilder("Good");
        for (int i = 0; i <10000 ; i++) {
            goodBuilder.append(i);


        }
        System.out.println(goodBuilder.toString());

    }


}
