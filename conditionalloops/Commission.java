package com.conditionalloops;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");int amount = sc.nextInt();
        System.out.println("Enter the commission rate : ");int rate = sc.nextInt();
        double ans=amount*rate/100;
        System.out.println("Commission amount : "+ans);

    }
}
