package com.example.bubbleSort;

import java.util.ArrayList;
import java.util.List;

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

        LinkedListNode rootNode = new LinkedListNode(5);

        addList(rootNode, 3);
        addList(rootNode, 5);
        addList(rootNode, 6);
        addList(rootNode, 7);
        addList(rootNode, 1);
        addList(rootNode, 4);

        bubble(rootNode);

        List<Integer> integers = easyPrint(rootNode);

        System.out.println(integers);

        System.out.println(rootNode);
        System.out.println(rootNode.right);
        System.out.println(rootNode.right.right);
        System.out.println(rootNode.right.right.right);
        System.out.println(rootNode.right.right.right.right);
        System.out.println(rootNode.right.right.right.right.right);
        System.out.println(rootNode.right.right.right.right.right.right);

    }

    private static List<Integer> easyPrint(LinkedListNode rootNode) {
        int size = getSize(rootNode);

        LinkedListNode temp = new LinkedListNode();

        List<Integer> num = new ArrayList<>();
        temp = rootNode;

        for (int i = 1; i < size; i++) {
            while (temp.right != null) {
                num.add(temp.value);
                temp = temp.right;
                if (temp.right == null) {
                    num.add(temp.value);
                }
            }
        }
        return num;

    }

    private static void bubble(LinkedListNode rootNode) {
        // ?????? ???????????? ???????????? ??????
        int size = getSize(rootNode);
        LinkedListNode temp = new LinkedListNode();  // ??? ?????? ??????

        //7
        for (int i = 0; i < size; i++) {
            temp = rootNode;

            while (temp.right != null) {
                if (temp.value > temp.right.value) {
                    swap(temp);
                    temp = temp.right;

                } else if (temp.value < temp.right.value) {
                    temp = temp.right;
                } else {
                    temp = temp.right;
                }
            }
        }
    }
    private static int getSize(LinkedListNode rootNode) {

        int a = 1;

        LinkedListNode temp = new LinkedListNode();
        temp = rootNode;

        while (temp.right != null) {
            a++;
            temp = temp.right;
        }
        return a;
    }

    private static void swap(LinkedListNode rootNode) {
        int temp = rootNode.value;
        
        rootNode.setValue(rootNode.right.value);
        
        rootNode.right.setValue(temp);

    }


    private static void addList(LinkedListNode rootNode, int i) {
        
        LinkedListNode temp = new LinkedListNode();  // ??? ?????? ??????

        temp = rootNode;   //???????????? ????????? ???????????? ???????????? ??????

        while (temp.right != null) {   // ??????(??????) ????????? right??? ?????? null??? ?????? ?????????
            temp = temp.getRight();  // ??????(??????) ????????? ??????(??????) ????????? right ????????? ???????????? ??????
        }
        
        temp.setRight(i);  // ?????? ???????????? ????????? ?????? ?????? ????????? ?????????
   
    }

//    public static void bubbleSort(LinkedList<LinkedListNode> integers){
//
//        for (int j = 0; j < integers.size(); j++) {
//            for (int i = 0; i < integers.size()-1; i++) {
//                if (integers.get(i).value > integers.get(i+1).value){
//                    swap(integers,i,i+1);
//                }
//            }
//        }
//    }
//
//    public static void swap(LinkedList<LinkedListNode> integers, int a, int b){
//
//        int value1 = integers.get(a).value;
//        integers.get(a).value = integers.get(b).value;
//        integers.get(b).value = value1;
//
//    }

}
