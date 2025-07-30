package com.collectionpractice.basicMath;

public class CountDivisorsofN {

    public static int countDivisors(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
                if(i!=n/i){
                    System.out.print (n/i+" ");
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDivisors(36));
    }
}
