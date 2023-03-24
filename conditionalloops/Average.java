package com.conditionalloops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of values to be entered : ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("enter the number : ");int a= sc.nextInt();
            sum+=a;
        }
        System.out.println("Average :"+sum/n);
    }
}
