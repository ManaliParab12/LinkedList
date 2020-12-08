package com.linkedlist;

public interface INode<k> {
    k getKey();

    void setKey(k key);

    INode getNext();

    void setNext(INode<k> next);
}
