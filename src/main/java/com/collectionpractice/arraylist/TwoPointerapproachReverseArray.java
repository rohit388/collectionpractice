package com.collectionpractice.arraylist;

import java.util.ArrayList;

public class TwoPointerapproachReverseArray {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++){
            list.add(i);
        }

        for(int i=0, j=list.size()-1; i<j; i++, j--){

            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j,temp);

        }
        System.out.println("Reversed array : "+ list);
    }
}
