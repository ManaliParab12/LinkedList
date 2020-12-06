package com.linkedlist;

public class MyStack {

    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirst();
    }

    public int length() {
        return myLinkedList.length();
    }

    public boolean isEmpty() {
        if (length() == 0) {
            System.out.println("Stack is Empty");
            return true;
        } else {
            System.out.println("Stack is not Empty");
            return false;
        }
    }

    public boolean makeStackEmpty(){
        MyStack myStack = new MyStack();
        while(!myStack.isEmpty()){
            pop();
        }
        return true;
    }
}
