package com.linkedlist;

public class MyQueue {

    private final MyLinkedList myLinkedList;
    private final MyStack myStack;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
        this.myStack = new MyStack();
    }

    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
       return myLinkedList.head;
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }
    public boolean dequeue() {
        return myStack.makeStackEmpty();
    }


}
