package com.collectionpractice.linkedList;

import java.util.LinkedList;

public class MergerTwoLinkedList {

    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(3);list1.add(4);list1.add(5);

        LinkedList<Integer>list2 = new LinkedList<>();
        list2.add(3);list2.add(5);list2.add(6);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(list1);
        linkedList.addAll(list2);

        System.out.println(linkedList);

        LinkedList<Integer> rmdlist = new LinkedList<>(list1);
        for(int num : list2){

            if(!rmdlist.contains(num)){
                rmdlist.add(num);
            }
        }
        System.out.println(rmdlist);

    }
}
