package com.firstjava;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.print("Enter number one : ");
            int a = sc.nextInt();
            System.out.print("Enter number two : ");
            int b = sc.nextInt();
            System.out.print("Select operator : ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (ch == '+') {
                    int ans = a + b;
                    System.out.println("addition : " + ans);
                } else if (ch == '-') {
                    int ans = a - b;
                    System.out.println("subtraction : " + ans);
                } else if (ch == '*') {
                    int ans = a * b;
                    System.out.println("multiplicaion : " + ans);
                } else {
                    double ans = a / b;
                    System.out.println("division : " + ans);
                }
            } else {
                System.out.println("invalid operator");
                break;
            }
        }
    }
}
