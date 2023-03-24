package com.firstjava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the start number :");int start= sc.nextInt();
        System.out.print("enter the end number :");int end= sc.nextInt();
        for(int i=start;i<end;i++){
            int sum=0;
            int temp=i;
            int rem;
            while(temp!=0){
                rem=temp%10;
                sum=sum+(rem*rem*rem);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i+" is armstrong number .");
            }
        }

    }
}
