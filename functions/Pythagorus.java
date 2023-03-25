package com.functions;

import java.util.Scanner;

public class Pythagorus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side 1 : ");int a= sc.nextInt();
        System.out.print("Enter the side 2 : ");int b=sc.nextInt();
        System.out.print("Enter the side 3 : ");int c=sc.nextInt();
        if(Pytha(a,b,c)) System.out.println("Pythagorus triplet.");
        else System.out.println("Not Pythagorus triplet.");

    }
    static boolean Pytha(int a,int b, int c){
        return Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2);
    }
}
