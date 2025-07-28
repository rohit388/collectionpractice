package com.collectionpractice.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

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
        System.out.println("\nremove duplicate without ordered way");

        HashSet<Integer>set = new HashSet<>(mergeList);
        System.out.println("Remove the duplicate: "+set);
        System.out.println("\nremove duplicate in ordered way: ");

        LinkedHashSet<Integer> linked = new LinkedHashSet<>(mergeList);
        System.out.println("ordered way: "+linked);


    }
}
