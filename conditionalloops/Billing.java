package com.conditionalloops;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Units used : ");int unit=sc.nextInt();
        double amount=0;
        if(unit<100){
            amount=unit*1.20;
        } else if (unit < 300) {
            amount=100*1.20+(unit-100)*2;
        }else if(unit > 300){
            amount=100*1.20+200*2+(unit-200)*3;
        }
        System.out.println("the amount to be paid is "+amount);
    }
}
