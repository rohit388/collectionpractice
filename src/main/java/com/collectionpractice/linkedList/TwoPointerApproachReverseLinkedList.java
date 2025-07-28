package com.collectionpractice.linkedList;

import java.util.LinkedList;

public class TwoPointerApproachReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);list.add(3);list.add(4);list.add(5);

        for(int i=0, j=list.size()-1;i<j;i++,j--){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);
        }

        System.out.println("Reversed LinkedList Two pointer approach: "+list);
    }

}
