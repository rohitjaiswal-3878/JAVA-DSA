package com.firstjava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the amount in rupees : ");int a=sc.nextInt();
        double usd=a/82.48;
        System.out.printf("USD : %.2f",usd);
    }
}
