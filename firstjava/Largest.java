package com.firstjava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");int a=sc.nextInt();
        System.out.println("Enter the second number : ");int b=sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        System.out.println("largest number is "+max);

    }
}
