package ru.itsjava.lectures.oop.collection;

import ru.itsjava.objectPractice.Cake;

public class MyListRunner {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add (new Cake("эклер",2.0, true));
        System.out.println("list.size() = " + list.size());
        list.add (new Cake("Буше",3.1, false));
        System.out.println("list.size() = " + list.size());
        System.out.println(list.toString());
//MyLinkedList linkedList = new MyLinkedList();
//new Node("1", new Node("3",new Node( "7", new Node("5", new Node("0", null)))));
   //     System.out.println("linkedList.toString() = " + linkedList.toString());

    }
}
