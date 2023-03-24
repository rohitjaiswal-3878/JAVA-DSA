package com.conditionalloops;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");int a=sc.nextInt();
        int sum=0;
        int product=1;
        while(a!=0){
            int rem=a%10;
            sum=sum+rem;
            product=product*rem;
            a/=10;
        }
        System.out.println(sum+" "+product);
        int ans=product-sum;
        System.out.println("answer is "+ans);
    }
}
