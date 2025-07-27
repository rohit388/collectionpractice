package com.collectionpractice.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeTwoListRemoveDublicate {

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(30);
        list2.add(40);

        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(list1);
        mergeList.addAll(list2);

        System.out.println("Merge the two list: "+mergeList);

        HashSet<Integer>set = new HashSet<>(mergeList);
        System.out.println("Remove the dublicate: "+set);

    }
}
