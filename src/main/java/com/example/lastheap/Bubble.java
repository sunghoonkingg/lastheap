package com.example.bubbleSort;

import java.util.LinkedList;

public class LinkedListNode {

    public int value;

    public LinkedListNode left;

    public LinkedListNode right;

    public LinkedListNode root;

    public LinkedListNode() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    public LinkedListNode getLeft() {
        return left;
    }

    public LinkedListNode getRight() {
        return right;
    }

    public void setLeft(LinkedListNode left) {
        this.left = left;
    }

    public void setRight(int value) {
        this.right = new LinkedListNode(value);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "value=" + value +
                '}';
    }
    public LinkedListNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public static void main(String[] args) {

//        LinkedList<Bubble> integers = new LinkedList<>();
//
//        integers.add(new Bubble(9));
//        integers.add(new Bubble(2));
//        integers.add(new Bubble(5));
//        integers.add(new Bubble(3));
//        integers.add(new Bubble(5));
//        integers.add(new Bubble(8));
//        integers.add(new Bubble(1));



        LinkedListNode rootNode = new LinkedListNode(5);

        addList(rootNode,3);
        addList(rootNode,7);
        addList(rootNode,6);
        addList(rootNode,1);
        addList(rootNode,2);
        addList(rootNode,4);

        bubble(rootNode);

//        bubbleSort(integers);
//
//        System.out.println(integers);
    }

    private static void bubble(LinkedListNode rootNode) {



    }

    private static void addList(LinkedListNode rootNode, int i) {

        LinkedListNode temp = new LinkedListNode();  // 빈 주소 노드

        temp = rootNode;   //템프라는 노드에 루트노드 주소값이 들어 있 어요

        while (temp.right != null){   // 템프(루트) 노드에 right의 값이 null이 아닐 때까지
            temp = temp.getRight();  // 템프(루트) 노드는 템프(루트) 노드의 right 노드의 주소값을 가짐
        }

        temp.setRight(i);  // 템프 노드에는 새로운 값을 가진 노드를 저장함

    }

    public static void bubbleSort(LinkedList<LinkedListNode> integers){

        for (int j = 0; j < integers.size(); j++) {
            for (int i = 0; i < integers.size()-1; i++) {
                if (integers.get(i).value > integers.get(i+1).value){
                    swap(integers,i,i+1);
                }
            }
        }
    }

    public static void swap(LinkedList<LinkedListNode> integers, int a, int b){

        int value1 = integers.get(a).value;
        integers.get(a).value = integers.get(b).value;
        integers.get(b).value = value1;

    }

}
