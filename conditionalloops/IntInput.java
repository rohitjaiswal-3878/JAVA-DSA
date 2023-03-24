package com.conditionalloops;

import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("enter the integer : ");int a=sc.nextInt();
            if(a==0){
                break;
            }
            sum+=a;
        }
        System.out.println(sum);
    }
}
