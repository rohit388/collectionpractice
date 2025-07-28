package com.collectionpractice.collection.arraylist.linkedList;

import java.util.LinkedList;

public class FindNthElementfromLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);

        int size = list.size();
        int n=2; //where n is position

        if(n>0 && n>size){
            System.out.println("N is bigger than size of list");
        }
        else{
            int index = size-n;
            System.out.println("Nth position from the last or End: "+list.get(index));
        }

        if(n>0 && n>size){
            System.out.println("N is bigger than size of list");
        }
        else{
            int index = n-1;
            System.out.println("Nth position from the start: "+list.get(index));
        }
    }
}
