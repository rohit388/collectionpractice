package com.collectionpractice.recurtion;

public class GCD {
    public static int gcdPrint(int a, int b){
        //base case
        if(b==0)
            return a;
       return gcdPrint(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcdPrint(48,18));
    }
}
