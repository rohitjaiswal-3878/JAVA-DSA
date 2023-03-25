package com.functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the age :");int a=sc.nextInt();
        if(Vote(a)) System.out.println("Eligible .");
        else System.out.println("Not eligible.");
    }
    static boolean Vote(int age){
        return age>=18;
    }
}
