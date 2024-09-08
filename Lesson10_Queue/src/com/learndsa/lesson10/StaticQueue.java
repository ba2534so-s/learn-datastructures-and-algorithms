package com.learndsa.lesson10;

public class StaticQueue {

    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("Queue is full");;
        }
    }

    public int deQueue() {
        int data = 0;
        if (!isEmpty()) {
            data = queue[front];
            queue[front] = 0;
            size--;
            front = (front + 1) % 5;

        }
        return data;
    }

    public void show() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size <= 0;
    }
    
    public boolean isFull() {
        return size >= 5;
    }

}
