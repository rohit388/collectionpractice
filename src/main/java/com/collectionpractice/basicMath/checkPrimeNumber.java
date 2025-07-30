package com.collectionpractice.basicMath;

import java.util.Scanner;
class CheckPrime{
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

public class checkPrimeNumber {
    public static void main(String[] args) {
        CheckPrime cp = new CheckPrime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        boolean result = cp.isPrime(num);
        System.out.println("Number is prime: "+result);

    }
}
