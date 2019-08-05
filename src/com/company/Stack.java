package com.company;

public class Stack {
    private int capacity;
    private int[] elements;
    private int numOfElements;
    private int pointer;

    Stack() {
        capacity = 16;
        elements = new int[capacity];
        numOfElements = 0;
        pointer = 0;

    }

    Stack(int cap) {
        capacity = cap;
        elements = new int[capacity];
        numOfElements = 0;
        pointer = 0;
    }

    public void push(int num) {
        if(numOfElements != capacity) {
            numOfElements++;
            elements[pointer] = num;
            pointer++;
        }
        else
            System.out.println("!!!!!Stack Full!!!!!");
    }

    public void pop ()
    {
        if(pointer == 0) {
        System.out.println("!!!!!Stack Empty!!!!!");
        }
        else {
            numOfElements--;
            pointer--;
        }
    }
    public void printStack() {
        for (int i = 0; i < pointer; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("-----End of Stack-----");
    }

    public void printStackVar() {
        System.out.println("Capacity : " + capacity + ", numOfElements : " + numOfElements + ", Pointer ; " + pointer);
    }
}
