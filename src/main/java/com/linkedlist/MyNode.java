package com.linkedlist;

public class MyNode<K> implements INode<K>{

    private K key;
    private INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    public void setNext(INode next){
        this.next = (MyNode<K>) next;
    }

    public static void main(String[] args){
        System.out.println("Welcome to the Program of Linked List");
    }
}
