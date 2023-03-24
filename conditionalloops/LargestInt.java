package com.conditionalloops;

import java.util.Scanner;

public class LargestInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max=0;
        while(true){
            System.out.print("enter the number : ");int a=sc.nextInt();
            if(a>max) {
                max = a;
            };
            if(a==0){
                break;
            }
        }
        System.out.println(max);
    }
}
