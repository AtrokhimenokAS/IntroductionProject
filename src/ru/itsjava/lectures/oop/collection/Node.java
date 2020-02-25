package ru.itsjava.lectures.oop.collection;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> head;

    public Node(T value, Node<T> next, Node<T> head) {
        this.value = value;
        this.next = next;
        this.head = head;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList{");
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.getValue().toString()).append(',');
            node = node.getNext();
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}
