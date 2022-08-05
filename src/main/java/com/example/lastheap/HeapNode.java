package com.example.lastheap;

public class HeapNode<T> {
    private T element;

    private HeapNode<T> left;

    private HeapNode<T> right;

    public HeapNode(T element, HeapNode<T> left, HeapNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public void setLeft(HeapNode<T> left){
        this.left = left;
    }

    public void setRight(HeapNode<T> right){
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public HeapNode<T> getLeft() {
        return left;
    }

    public HeapNode<T> getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "HeapNode{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}