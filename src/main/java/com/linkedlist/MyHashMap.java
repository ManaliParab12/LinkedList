package com.linkedlist;

public class MyHashMap<k extends Comparable<k>, v> {

     MyLinkedList<k> myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public v get(k key) {
       MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) myLinkedList.search(key);
       return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(k key, v value) {
        MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) myLinkedList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "myLinkedList=" + myLinkedList +
                '}';
    }
}
