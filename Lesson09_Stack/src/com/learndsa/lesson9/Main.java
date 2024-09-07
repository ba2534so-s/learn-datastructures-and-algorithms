package com.learndsa.lesson9;

public class Main {
    public static void main(String[] args) {

        /* 
        StaticStack staticStack = new StaticStack();

        System.out.println("Empty: " + staticStack.isEmpty());

        staticStack.push(18);
        staticStack.push(5);
        staticStack.push(13);

        System.out.println("Deleted: " + staticStack.pop());
        System.out.println("Peek: " + staticStack.peek());
        System.out.println("Size: " + staticStack.size());

        System.out.println("Empty: " + staticStack.isEmpty());

        staticStack.show();
        */

        DynamicStack dStack = new DynamicStack();

        dStack.push(23);
        dStack.show();
        dStack.push(12);
        dStack.show();
        dStack.push(83);
        dStack.show();
        dStack.push(58);
        dStack.show();
        dStack.push(29);
        dStack.show();

        dStack.pop();
        dStack.show();
        
    }
}
