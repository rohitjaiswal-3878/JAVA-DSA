package com.functions;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");int a=sc.nextInt();
        System.out.print("Enter the number 2 : ");int b=sc.nextInt();
        System.out.println("Product : "+product(a,b));
    }
    static int product(int a,int b){
        return a*b;
    }
}
