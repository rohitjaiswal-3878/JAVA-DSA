package com.functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check palindrome : ");int a= sc.nextInt();
        if(Palindrome(a)) System.out.println("Palindrome number.");
        else System.out.println("Not palindrome.");
    }
    static boolean Palindrome(int a){
        int temp=a,sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        return sum==a;
    }
}
