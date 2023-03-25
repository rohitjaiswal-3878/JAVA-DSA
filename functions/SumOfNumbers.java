package com.functions;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");int a=sc.nextInt();
        System.out.print("Enter the number 2 : ");int b=sc.nextInt();
        System.out.println("Addition : "+add(a,b));

    }
    static int add(int a,int b){
        return a+b;
    }
}
