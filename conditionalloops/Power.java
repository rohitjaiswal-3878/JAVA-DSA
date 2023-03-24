package com.conditionalloops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");int a = sc.nextInt();
        System.out.println("Enter the power : ");int b= sc.nextInt();
        System.out.println("Result : "+Math.pow(a,b));
    }
}
