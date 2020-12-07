package com.linkedlist;

public class MyBinaryNode<k extends Comparable<k>> {
    k key;
    MyBinaryNode<k> left;
    MyBinaryNode<k> right;

    public MyBinaryNode(k key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
