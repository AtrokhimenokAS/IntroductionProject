package ru.itsjava.lectures.oop.collection;

import java.util.Collection;
import java.util.List;


public class MyLinkedList <T> {
    private Node  head;
    private Node  end;
    private int size;

    public MyLinkedList(Node head, Node end, int size) {
        this.head = head;
        this.end = end;
        this.size = size;
    }

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        if (isEmpty()) {
            head = new Node(o, null);
            return true;
        }
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(o, null));
        return true;
    }

    public boolean remove(Object o) {
        Node curNode = head;
        Node prev = null;
        while (!curNode.getValue().equals(o)) {
            prev = curNode;
            curNode = curNode.getNext();
        }

        prev.setNext(curNode.getNext());
        return true;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public Node get(int index) {
        Node node = head;
        if (index < 0 || index > size - 1) {
            System.err.println("Не верный индекс");
        }
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }


    public boolean removeAll(Collection c) {
        return false;
    }


    public boolean containsAll(Collection c) {
        return false;
    }
}
