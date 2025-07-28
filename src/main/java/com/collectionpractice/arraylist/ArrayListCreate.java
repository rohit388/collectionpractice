package com.collectionpractice.arraylist;

import java.util.ArrayList;

public class ArrayListCreate {

    public static void main(String[] args){

        ArrayList<Integer> addNumber = new ArrayList<>();
         addNumber.add(1);
         addNumber.add(2);
         addNumber.add(3);
         addNumber.add(4);
         addNumber.add(5);
         addNumber.add(6);
         addNumber.add(7);
         addNumber.add(8);
         addNumber.add(9);
         addNumber.add(10);

        System.out.println(addNumber);

        System.out.println("Remove the even number: ");
        for(int n : addNumber){
            if(n%2==1){
                System.out.print(n+",");
            }
        }
        System.out.println("\n");




    }

}
