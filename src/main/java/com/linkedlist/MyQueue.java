package com.linkedlist;

public class MyQueue {

    private final MyLinkedList myLinkedList;
    private final MyStack myStack = new MyStack();

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
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
