package ru.itsjava.lectures.oop;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private String breed;
    private boolean isBark;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public boolean getIsBark;

}
