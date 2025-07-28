package com.collectionpractice.collection.arraylist.linkedList;

import java.util.LinkedList;

public class TwoPointerApproachFindNthElementFromLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);list.add(3);list.add(4);list.add(5);

        int n=2;
        int size = list.size();

        if(n>0 && n>size){
            System.out.println("N is bigger than size: ");
            return;
        }
        int first = 0;
        int second = 0;
        // Move first pointer n steps ahead
        while(first<n){
            first++;
        }
        // Move both pointers until first reaches the end
        while(first<size){
            first++;
            second++;
        }

        System.out.println("Nth element from the End: "+list.get(second));
    }
}
