package ru.itsjava.lectures.oop.collection;

public class Person {
    private String gender;
    private String name;
    private int age;

    public Person(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public  String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + gender + " " + name + " " + age + '}';
    }
}
