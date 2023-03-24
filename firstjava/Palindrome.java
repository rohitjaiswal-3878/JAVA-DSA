package com.firstjava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome : ");
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        while(a!=0){
            int rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        if(temp==sum){
            System.out.println("the entered number is palindrome");
        }
        else{
            System.out.println("the entered number is not palindrome");
        }

    }
}
