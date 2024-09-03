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
        node.setData(data);
        node.setNext(null);
        
        if (getHead() != null) {
            node.setNext(getHead());
        }

        this.setHead(node);
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = getHead();
            for (int i = 0; i < index-1; i++) {
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            this.setHead(head.getNext());
        } else {
            Node n = getHead();
            Node toDelete = null;
            for (int i = 0; i < index-1; i++) {
                n = n.getNext();
            }
            toDelete = n.getNext();
            n.setNext(toDelete.getNext());
            

        }
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
