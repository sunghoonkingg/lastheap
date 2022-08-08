package com.example.bubbleSort;

import java.util.LinkedList;

public class Bubble {

    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Bubble(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {

        LinkedList<Bubble> integers = new LinkedList<>();


        integers.add(new Bubble(9));
        integers.add(new Bubble(2));
        integers.add(new Bubble(5));
        integers.add(new Bubble(3));
        integers.add(new Bubble(5));
        integers.add(new Bubble(8));
        integers.add(new Bubble(1));



        bubbleSort(integers);

        System.out.println(integers);
    }
    public static void bubbleSort(LinkedList<Bubble> integers){

        for (int j = 0; j < integers.size(); j++) {
            for (int i = 0; i < integers.size()-1; i++) {
                int a = i;
                int b = i+1;
                if (integers.get(a).value > integers.get(b).value){
                    swap(integers,a,b);
                }
            }
        }


    }

    public static void swap(LinkedList<Bubble> integers, int a, int b){
        int value1 = integers.get(a).value;
        integers.get(a).value = integers.get(b).value;
        integers.get(b).value = value1;

    }


}
