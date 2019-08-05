package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack1 = new Stack(5);
        stack1.pop();
        stack1.push(5);
        stack1.push(85);
        stack1.printStack();
        stack1.printStackVar();
        stack1.pop();
        stack1.printStack();
        stack1.printStackVar();
        stack1.pop();
        for(int i = 1; i < 10; i++ )
        {
            stack1.push(i*8);
        }
        stack1.printStack();
        stack1.printStackVar();
        for(int i = 1; i < 10; i++ )
        {
            stack1.pop();
        }
        stack1.printStack();
        stack1.printStackVar();
    }
}
