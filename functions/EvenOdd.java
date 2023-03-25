package com.functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");int a=sc.nextInt();
        if(EvenOdd(a)){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    static boolean EvenOdd(int n){
        return n%2==0;
    }
}
