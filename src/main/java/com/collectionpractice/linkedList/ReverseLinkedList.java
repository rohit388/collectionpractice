package com.collectionpractice.linkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);list.add(3);list.add(4);list.add(5);

        LinkedList<Integer> reverse = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            reverse.add(list.get(i));
        }
        System.out.println(reverse);
    }
}
