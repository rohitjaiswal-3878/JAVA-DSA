package com.conditionalloops;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present Amount : ");double amount= sc.nextInt();
        System.out.println("Enter the interest rate : ");double rate = sc.nextInt();
        System.out.println("Enter the time period : ");double time = sc.nextInt();
        double ans = (double)amount*Math.pow((1+rate/100),time);
        System.out.printf("Future investment value : %.2f",ans);
    }
}
