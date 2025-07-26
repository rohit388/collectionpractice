package com.collectionpractice.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int n = sc.nextInt();
        ArrayList<Integer> addNumber = new ArrayList<>();

        for(int i=1;i<=10;i++){
            addNumber.add(i);
        }

        int min = addNumber.get(0);
        int max = addNumber.get(0);

        for(int num: addNumber){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);

    }
}
