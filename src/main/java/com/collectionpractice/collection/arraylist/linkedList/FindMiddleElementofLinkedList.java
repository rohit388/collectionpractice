package com.collectionpractice.collection.arraylist.linkedList;

import java.util.LinkedList;

public class FindMiddleElementofLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);list.add(60);list.add(70);list.add(80);list.add(90);

        int slow=0;
        int fast=0;
        
        while(fast<list.size()-1 && fast+1<list.size()-1){
            slow++;
            fast = fast+2;
        }
        System.out.println("Middle Element: " + list.get(slow));
        int totalsize = list.size();
        int midindex = totalsize/2;

        for(int i=0;i<totalsize;i++){
            if(i==midindex){
                System.out.println("MiddleIndex: "+ list.get(i));
            }
        }
    }
}
