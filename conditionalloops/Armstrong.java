package com.conditionalloops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth value : ");int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int temp=i,rem,count=0;
            double sum=0;
            while(temp>0){
                temp/=10;
                count++;
            }
            temp=i;
            while(temp!=0){
                rem=temp%10;
                sum=sum+Math.pow(rem,count);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i+" is Armstrong number.");
            }
        }
    }
}
