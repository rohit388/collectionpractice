package com.collectionpractice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[]args){
        ArrayList<Integer> sort = new ArrayList<>();
        sort.add(20);sort.add(40);sort.add(30);sort.add(60);sort.add(50);sort.add(70);

        for(int i=0, j=sort.size()-1;i<j;i++,j--){
            int temp = sort.get(i);
            sort.set(i,sort.get(j));
            sort.set(j,temp);

        }
        System.out.println(sort);

        Collections.sort(sort, Collections.reverseOrder());
        System.out.println(sort);

    }
}
