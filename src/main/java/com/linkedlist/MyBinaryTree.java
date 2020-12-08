package com.linkedlist;

public class MyBinaryTree<k extends  Comparable<k>> {
    private MyBinaryNode<k> root;

    public void add(k key) {
        this.root = this.addRecursively( root, key);
    }

    private MyBinaryNode<k> addRecursively(MyBinaryNode<k> current, k key) {
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0) {
            current.left = addRecursively( current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
        }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<k> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                                       + this.getSizeRecursive(current.right);
    }

    public boolean ifNodeExists(MyBinaryNode<k> current, k key){
        boolean searchNode = false;
        if(current == null) {
            return false;
        } if(current.key == key) {
            return true;
        }
        if(current.key.compareTo(key) < 0) {
            searchNode = ifNodeExists(current.left, key);
        } else if(current.key.compareTo(key) > 0) {
            searchNode = ifNodeExists(current.right, key);
        }
        return searchNode;
    }

    public boolean search(k key) {
        if(ifNodeExists(root, key)){
            System.out.println("yes");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }

}

