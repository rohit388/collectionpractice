package com.collectionpractice.recurtion;

public class PrintNumber {
    public static void printNumber(int n){
        //basecase
        if(n==0)
            return;
        printNumber(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}
