package com.learndsa.lesson10;

public class StaticQueue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        queue[rear] = data;
    }

}
