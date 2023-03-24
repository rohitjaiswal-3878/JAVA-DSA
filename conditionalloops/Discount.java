package com.conditionalloops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double maketprice,discount,s;
        System.out.print("Enter the market price : ");maketprice=sc.nextDouble();
        System.out.println("Enter the discount : ");discount=sc.nextDouble();

        s=maketprice-(maketprice*discount/100);

        System.out.println("market price : "+maketprice);
        System.out.println("discount : "+discount);
        System.out.println("Amount to be paid : "+s);
    }
}
