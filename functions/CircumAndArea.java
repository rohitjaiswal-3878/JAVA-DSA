package com.functions;

import java.util.Scanner;

public class CircumAndArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius : ");int e=sc.nextInt();
        System.out.printf("Circumference : %.2f\n",circum(e));
        System.out.printf("Area : %.2f",area(e));

    }
    static double circum(int r){
        return 2*Math.PI*r;
    }
    static double area(int r){
        return Math.PI*Math.pow(r,2);
    }
}
