package com.conditionalloops;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of subjects : ");int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter the Subject "+i+" marks :");int a=sc.nextInt();
            sum+=a;
        }
        System.out.println("Average marks : "+sum/n);

    }
}
