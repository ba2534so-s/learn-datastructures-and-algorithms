package com.learndsa.lesson8;

public class LinkedList {
    private Node head;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }

    public void insert(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if (head == null) {
            this.setHead(node);
        } else {
            Node n = this.getHead();
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
    }

    public void show() {
        Node node = getHead();
        while (node.getNext() != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println(node.getData());
    }
}
