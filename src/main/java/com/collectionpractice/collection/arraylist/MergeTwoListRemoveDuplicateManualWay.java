package com.collectionpractice.collection.arraylist;


import java.util.ArrayList;

public class MergeTwoListRemoveDuplicateManualWay {
    public static void main(String[]args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);list1.add(20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);list2.add(30);list2.add(40);

        ArrayList<Integer> mergedArray = new ArrayList<>(list1);
        for(int num : list2){
            if(!mergedArray.contains(num)){
                mergedArray.add(num);
            }
        }
        System.out.println("Merged Array Remove the duplicates: "+mergedArray);

    }
}
