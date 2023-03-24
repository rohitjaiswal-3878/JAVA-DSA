package com.conditionalloops;

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");float amount=sc.nextInt();
        System.out.println("Enter the rate : ");float rate= sc.nextInt();
        System.out.println("Enter the time : ");float time = sc.nextInt();
        double ans=amount * Math.pow((1+rate/100),time)-amount;
        System.out.printf("Compound interest : %.2f",ans);
    }
}
