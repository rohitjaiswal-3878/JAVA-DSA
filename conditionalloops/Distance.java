package com.conditionalloops;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the point 1 x1 :");int x1=sc.nextInt();
        System.out.print("Enter the point 1 y1 :");int y1=sc.nextInt();
        System.out.print("Enter the point 2 x2 :");int x2=sc.nextInt();
        System.out.print("Enter the point 2 y2 :");int y2=sc.nextInt();
        double ans=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("distance : %.2f",ans);

    }
}
