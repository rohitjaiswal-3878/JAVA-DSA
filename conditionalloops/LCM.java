package com.conditionalloops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1 : ");int a=sc.nextInt();
        System.out.println("Enter the number 2 : ");int b=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=a && i<=b;i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println("LCM : "+lcm);
    }
}
