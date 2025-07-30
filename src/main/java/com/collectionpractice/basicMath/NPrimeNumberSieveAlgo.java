package com.collectionpractice.basicMath;

import java.util.Scanner;
public class NPrimeNumberSieveAlgo {
    public void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        int count=0;
        //initially all true
        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        for(int i=2;i*i<n; i++){
            if(isPrime[i]){
                for(int j = i*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]) System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        NPrimeNumberSieveAlgo cp = new NPrimeNumberSieveAlgo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
                cp.sieve(num);


    }
}
