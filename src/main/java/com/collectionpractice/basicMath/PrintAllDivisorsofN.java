package com.collectionpractice.basicMath;

public class PrintAllDivisorsofN {

    static void printAllDeviser(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print("["+i+",");
                if(i!=n/i){
                    System.out.print((n/i)+" "+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        printAllDeviser(36);
    }

}
