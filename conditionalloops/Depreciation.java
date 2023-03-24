package com.conditionalloops;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount : ");float a= sc.nextFloat();
        System.out.println("enter the rate : ");float b=sc.nextFloat();
        System.out.println("enter the time : ");float c=sc.nextFloat();
        float D = (float)(a * Math.pow((1 - b / 100), c));
        System.out.println("result : "+D);
    }
}
