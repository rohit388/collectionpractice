package com.collectionpractice.basicMath;

import java.util.Scanner;

public class OptimizedTrialAlgoCheckPrimeSingleVlaue {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for the check the prime number: ");
        int value= sc.nextInt();
        System.out.println(isPrime(value));

    }
}
