package com.firstjava;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("number is even.");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
