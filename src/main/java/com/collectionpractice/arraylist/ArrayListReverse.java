package com.collectionpractice.arraylist;

import java.util.ArrayList;

public class ArrayListReverse {

    public static  void main(String[]args){
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=1;i<=10;i++){
            numbers.add(i);
        }

        ArrayList<Integer> reverse = new ArrayList<>();
        for(int i=numbers.size()-1; i>=0;i--){
            reverse.add(numbers.get(i));
        }
        System.out.println(reverse);

    }
}
