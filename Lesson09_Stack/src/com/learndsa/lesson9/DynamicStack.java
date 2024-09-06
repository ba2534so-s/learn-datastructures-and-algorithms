package com.learndsa.lesson9;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity) {
            expand();
        } else {
            stack[top] = data;
            top++;
        }
    }

    private void expand() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size()); 
        stack = newStack;
    }

    public int size() {
        return top;
    }

    public void show() {
        for( int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
