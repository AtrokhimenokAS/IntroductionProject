package ru.itsjava.lectures.oop.collection;

import java.util.Collection;
import java.util.List;


public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> end;
    private int size;

    public MyLinkedList(Node<T> head, Node<T> end, int size) {
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

    public boolean add(T t) {
        if (isEmpty()) {
            head = new Node(t, null, null);
            return true;
        }
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(t, null,null));
        return true;
    }

    public boolean remove(T t) {
        Node curNode = head;
        Node prev = null;
        while (!curNode.getValue().equals(t)) {
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
        head = end;
        end = null;
        size = 0;
    }

    public Node<T> get(int index) {
        Node node = head;
        if (index < 0) {
            System.err.println("Не верный индекс");
        }
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    public Node<T> set(int index, T element) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setValue(element);
        return node;
    }

    public void add(int index, T element) {
        Node<T> curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();

        }
        Node<T> prevNode = curNode.getHead();
        Node<T> nodeAdd = new Node<T>(element, curNode, prevNode);
        curNode.setHead(nodeAdd);
        if (prevNode == null) {
            head = nodeAdd;
        } else {
            prevNode.setNext(nodeAdd);
        }
        size++;
    }

    public Node<T> remove(int index) {
        Node<T> curNode = get(index);
        Node<T> nextNode = curNode.getNext();
        Node<T> prevNode = curNode.getHead();
        if (nextNode != null) {
            nextNode.setHead(prevNode);
            if (prevNode == null) {
                head = nextNode;
            }
        }
        if (prevNode != null) {
            prevNode.setNext(nextNode);
            if (nextNode == null) {
                end = prevNode;
            }
        }
        size--;
        if (size == 0) {
            head = end = null;
        }
        return curNode;
    }

    public int indexOf(T t) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(t)) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(T t) {
        Node<T> node = end;
        for (int i = size - 1; i > 0; i--) {
            if (node.getValue().equals(t)) {
                return i;
            }
            node = node.getHead();
        }
        return -1;
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
