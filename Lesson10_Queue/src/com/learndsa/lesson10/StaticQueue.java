package com.learndsa.lesson10;

public class StaticQueue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % 5;
        size++;
    }

    public int deQueue() {
        int data = queue[front];
        queue[front] = 0;
        size--;
        front = (front + 1) % 5;
        return data;
    }

    public void show() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

}
