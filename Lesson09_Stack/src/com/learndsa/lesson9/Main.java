package com.learndsa.lesson9;

public class Main {
    public static void main(String[] args) {

        
        StaticStack stack = new StaticStack();

        System.out.println("Empty: " + stack.isEmpty());

        stack.push(18);
        stack.push(5);
        stack.push(13);

        System.out.println("Deleted: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());

        System.out.println("Empty: " + stack.isEmpty());


        stack.show();
        
    }
}
