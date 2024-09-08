package com.learndsa.lesson10;

public class Main {
    public static void main(String[] args) {
        StaticQueue sQueue = new StaticQueue();
        
        sQueue.enQueue(34);
        sQueue.enQueue(27);
        sQueue.enQueue(7);
        sQueue.enQueue(82);
        sQueue.show();
    }
}
