package ru.itsjava.lectures.oop.collection;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> {

    private T[] array;
    private int size;

    public MyArrayList() {
        this(0);
    }

    public MyArrayList(int size) {
        array = (T[]) new Object[10];
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public boolean add(T o) {
        if (array.length == size) {
            T[] tempArray = (T[]) new Object[(3 * array.length / 2) + 1];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];

            }
            array = tempArray;
        }
        array[size] = (T) o;
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder resStrBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            resStrBuilder.append('[').append(array[i].toString()).append("] ");

        }
        resStrBuilder.append('}');
        return resStrBuilder.toString();
    }

    public boolean remove(T o) {
        T[] tempArrays = (T[]) new Object[array.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o) && count < 1) {
                count++;
            } else {
                tempArrays[index++] = (T) array[i];
            }
        }
        array = tempArrays;
        size--;
        return true;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public T set(int index, T element) {
        T value = array[index];
        array[index] = element;
        return value;
    }

    public void add(int index, T element) {
        if (array.length == size) {
            T[] tempArray = (T[]) new Object[(3 * array.length / 2 + 1)];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        for (int i = size - 1; i > index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public T remove(int index) {
        T value = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size--] = null;
        return value;
    }

    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean containsAll(Collection<T> c) {

        return false;
    }
}
