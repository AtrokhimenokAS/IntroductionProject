package ru.itsjava.lectures.oop.collection;

public class Node {
    private Object value;
    private Node next;
    private Node head;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
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
