package ru.itsjava.lectures.oop.paradigms;

import java.util.Arrays;

public class Beach {
    public static void main(String[] args) {
        Girl girl1 = new Girl("Юля", 32.6, 165, "+100500");
        Girl girl2 = new Girl("Галя", 17, 192, "+1812000");
        Girl girl3 = new Girl("Оля", 23.7, 169.3, "+1812312");
        Girl girl4 = new Girl("Ира", 28, 172.8, "+7999899");
        Girl girl5 = new Girl("Элеонора Леопольдовна", 72.9, 170, "6566696");
        Girl girls[] = new Girl[]{girl1, girl2, girl3, girl4, girl5};
        System.out.println(Arrays.toString(girls));
        System.out.println("girl1.equals(girl2) = " + girl1.equals(girl2));
        System.out.println("girl1.hashCode() = " + girl1.hashCode());
        System.out.println("girl2.hashCode() = " + girl2.hashCode());
        Girl girl6 = girl1;
        System.out.println("girl1==girl6 = " + (girl1 == girl6));
        System.out.println("girl1.equals(girl6) = " + girl1.equals(girl6));
        System.out.println("girl1.hashCode() = " + girl1.hashCode());
        System.out.println("girl6.hashCode() = " + girl6.hashCode());
    }
}
