package com.learndsa.lesson10;

public class Main {
    public static void main(String[] args) {
        StaticQueue sQueue = new StaticQueue();
        System.out.println("Is empty: " + sQueue.isEmpty());
        sQueue.enQueue(34);
        sQueue.enQueue(27);
        sQueue.enQueue(7);
        sQueue.enQueue(82);

        System.out.println("Is empty: " + sQueue.isEmpty());
        
        sQueue.show();

        sQueue.deQueue();
        sQueue.show();

        System.out.println("Is full: " + sQueue.isFull());
        sQueue.enQueue(42);
        sQueue.enQueue(55);
        System.out.println("Is full: " + sQueue.isFull());
        sQueue.show();
    }
}
