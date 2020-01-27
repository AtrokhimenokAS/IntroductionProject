package ru.itsjava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа по Лекции №1");
        System.out.println("Протестировать все операторы");
        int num1 = 43;
        int num2 = 120;
        System.out.println("Объявим переменные num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("Сложение num1+num2=" + (num1 + num2));
        System.out.println("Сложение с присваением num1+=num2=" + (num1 += num2));
        System.out.println("Вычитание num1-num2=" + (num1 - num2));
        System.out.println("Вычитание с присвоением num1-=num2=" + (num1 -= num2));
        System.out.println("Умножение num1*num2=" + (num1 * num2));
        System.out.println("Умножение с присваением num1*=num2=" + (num1 *= num2));
        System.out.println("Деление num1/num2=" + (num1 / num2));
        System.out.println("Деление с присваением num1/=num2=" + (num1 /= num2));
        int num3 = -43;
        int num4 = 1590;
        System.out.println("Объявим переменные num3=" + num3);
        System.out.println("num4=" + num4);
        System.out.println("Деление по модулю num4%num3=" + (num4 % num3));
        System.out.println("Деление по модулю с присваением num3%=num4=" + (num3 %= num4));
        System.out.println("Инкремент ++num1=" + (++num1));
        System.out.println("Декремент --num2=" + (--num2));
        System.out.println("Переменная возраста. пора служить или нет.");
        int age = 66;
        if ((age >= 18) && (age < 50)) {
            System.out.println("Готов нести военную службу");
        } else {
            System.out.println("Не может нести военную службу");
        }
    }
}