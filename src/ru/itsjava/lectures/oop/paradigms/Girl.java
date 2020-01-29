package ru.itsjava.lectures.oop.paradigms;

import java.util.Objects;

public class Girl {
    private String name;
    private double age;
    private double height;
    private String telephone;

    public Girl(String name, double age, double height,String telephone) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "name= " + name  +
                ", age=" + age +
                ", height=" + height +
                ", telephone=" + telephone + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        if (name == null) {
            if (girl.name != null)
                return false;
        } else {
            if (!name.equals(girl.name))
                return false;
        }
        if (age != girl.age)
            return false;
        if (height != girl.height)
            return false;
        if (telephone == null) {
            return girl.telephone == null;
        } else {
            return telephone.equals(girl.telephone);
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 96 * result + (int) (age * height);
        result += ((name == null) ? 0 : name.hashCode());
        result += ((telephone == null) ? 0 : telephone.hashCode());
        return result;

    }

}

