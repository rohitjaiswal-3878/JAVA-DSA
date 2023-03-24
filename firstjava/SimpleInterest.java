package com.firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the principle : ");int p=sc.nextInt();
        System.out.print("Enter the rate of interest : ");int r=sc.nextInt();
        System.out.print("Enter the time  : ");int t=sc.nextInt();
        int simpleinterest = (p*r*t)/100;
        System.out.println("Simple interest : "+simpleinterest);

    }
}
