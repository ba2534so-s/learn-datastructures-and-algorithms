package com.learndsa.lesson8;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(52);
        list.insert(36);
        list.insertAtStart(41);
        list.insertAt(2, 71);
        list.deleteAt(2);
        list.show();
    }
}
