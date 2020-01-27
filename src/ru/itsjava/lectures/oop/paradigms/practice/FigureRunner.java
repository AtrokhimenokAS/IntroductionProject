package ru.itsjava.lectures.oop.paradigms.practice;

public class FigureRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        System.out.println(rect.getLength());
        System.out.println(rect.calcSquare());
        System.out.println(rect.calcPerimeter());

        Triangle triangle = new Triangle(6,3.9,8);
        System.out.println(triangle.calcPerimeter());
        System.out.println(triangle.calcSquare());

        Circle circle = new Circle(10);
        System.out.println(circle.calcPerimeter());
        System.out.println(circle.calcSquare());
    }
}
