package com.learndsa.lesson9;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {

        stack[top] = data;
        top++;
    }

    public int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        top--;
        return stack[top];
    }

    public int size() {
        
    }

    public void show() {
        for(int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
