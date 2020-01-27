package ru.itsjava.lectures.oop.paradigms.practice;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI*2*radius;
    }
}
