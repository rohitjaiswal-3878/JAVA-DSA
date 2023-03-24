package com.firstjava;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");int n=sc.nextInt();
        int f=0,s=1;
        System.out.print(f+" "+s+" ");
        int count=2;
        while(count<n){
            int temp=s;
            s=s+f;
            f=temp;
            System.out.print(s+" ");
            count++;
        }
    }
}
