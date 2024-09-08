package com.learndsa.lesson10;

public class StaticQueue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        queue[rear] = data;
        rear++;
        size++;
    }

    public int deQueue() {
        rear--;
        int data = queue[rear];
        queue[rear] = 0;
        return data;
    }

    public void show() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
