package com.example.lastheap;

import java.util.ArrayList;
import java.util.Comparator;

public class HeapTestNode {
    private static Node root;
    private static Node cursor;

    public static void main(String[] args) {

        ArrayList<Node> arr = new ArrayList<>();

        Node root = null;
//        arr.add(new Node(4,new Node(1,new Node(2,null,null),new Node(5,null,null)),new Node(3,null,null)));
        arr.add(new Node(4,null,null));
        arr.add(new Node(1,null,null));
        arr.add(new Node(3,null,null));
        arr.add(new Node(2,null,null));
        arr.add(new Node(5,null,null));

        heapSort(arr);

        System.out.println("마지막" + arr);

    }
    public static void heapSort(ArrayList<Node> arr){


        System.out.print("최초" + arr);

        heaPify(arr,arr.size());

//        root = arr.get(0);
//        cursor = root;
//        int size = arr.size();
//
//        for (int i = 0; i < arr.size(); i++) {
//           heaPify();
//        }

        for (int i = arr.size()-1; i > 0 ; i--) {
            swap(arr.get(0),arr.get(i));
            heaPify(arr,i);
        }


    }

    private static void heaPify(ArrayList<Node> arr, int size) {
        // 배열이랑 size 받음

        // i 는 1부터 증가하면서 자식을 왜냐하면 0번은 루트노드 이기 때문
        for (int i = 1; i <size ; i++) {
            // 루토노드 바로 아래 자식
            int child = i;
            while (child > 0){
                int parent = (child -1)/2;
                if (arr.get(child).value > arr.get(parent).value){
                    swap(arr.get(child), arr.get(parent));
                }
                child = parent;
            }
//            int parent = (child -1)/2;  //0
//
//            // 1 = 4 > 0 = 1
//            if (arr.get(child).value > arr.get(parent).value){
//                swap(arr.get(child), arr.get(parent));
//            }
//            child = parent;
            // 자식 노드가 부노드로 바뀌기 전까지

        }
        System.out.println("최대힙" + arr);
    }

    private static void heaPify(Node node){

        Node parent = node;

        Node maxNode = Max(parent,cursor.left,cursor.right);
        if (parent != maxNode){
            swap(parent,maxNode);
            cursor = maxNode;
            heaPify(parent);
        }
    }

    private static Node Max(Node a, Node b, Node c){
        ArrayList<Node> linkedList = new ArrayList<>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);

        linkedList.sort(new Comparator<>() {
            @Override
            public int compare(Node c1, Node c2) {
                return c2.value - c1.value;
            }
        });
        Node first = linkedList.get(0);
        return first;
    }

    private static void swap(Node a, Node b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

}
