package com.conditionalloops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth value : ");int n=sc.nextInt();
        System.out.println("Summation : "+n*(n+1)/2);
    }
}
