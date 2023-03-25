package com.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check factorial :");
        int a=sc.nextInt();
        System.out.println("Factorial : "+fact(a));
    }
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
