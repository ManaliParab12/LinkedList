package com.linkedlist;

public class MyMapNode<k, v> implements  INode<k>{
    k key;
    v value;
    MyMapNode<k, v> next;

    public MyMapNode(k key, v value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public k getKey() {
        return key;
    }

    @Override
    public void setKey(k key) {
        this.key = key;

    }

    public v getValue() {
        return this.value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    @Override
    public INode<k> getNext() {
        return next;
    }


    @Override
    public void setNext(INode<k> next) {
        this.next = (MyMapNode<k, v>) next;

    }

    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
        if (next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
