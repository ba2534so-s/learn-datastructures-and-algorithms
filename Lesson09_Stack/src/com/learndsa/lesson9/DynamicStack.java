package com.learndsa.lesson9;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity) {
            expand();
        } 
        stack[top] = data;
        top++;
        
    }

    public int pop(){
        int data = 0;

        if(isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }

        return data;
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

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for( int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
