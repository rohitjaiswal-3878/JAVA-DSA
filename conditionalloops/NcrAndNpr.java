package com.conditionalloops;

import java.util.Scanner;

public class NcrAndNpr {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch;
        System.out.println("1. NcR operation.");
        System.out.println("2. NpR operation.");
        do{
            System.out.print("Enter Choice : ");ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter n value : ");int n=sc.nextInt();
                    System.out.print("enter r value : ");int r= sc.nextInt();
                    System.out.println("Combination : "+factorial(n)/(factorial(r)*factorial(n-r)));
                    break;
                case 2:
                    System.out.print("Enter n value : ");int n1=sc.nextInt();
                    System.out.print("enter r value : ");int r1= sc.nextInt();
                    System.out.println("Permutation : "+factorial(n1)/factorial(n1-r1));
                    break;
            }

        }while(ch!=3);
    }
}
