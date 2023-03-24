package com.conditionalloops;

import java.awt.*;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");int a=sc.nextInt();
        System.out.print("Enter the number 2 : ");int b=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0){
                System.out.println("common factors : "+i);
                hcf=i;
            }
        }
        System.out.println("Highest common factor : "+hcf);

    }
}
