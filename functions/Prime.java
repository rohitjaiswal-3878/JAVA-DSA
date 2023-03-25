package com.functions;

public class Prime {
    public static void main(String[] args) {
        System.out.println("printing prime number from 1 to 100");
        for (int i=1;i<=100;i++){
            if(isPrime(i))
            System.out.print(i+" ");
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c < n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
