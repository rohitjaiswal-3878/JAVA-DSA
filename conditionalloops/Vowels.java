package com.conditionalloops;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character :");char ch=sc.next().trim().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" is vowel.");
        }else{
            System.out.println(ch+" is consonant.");
        }
    }
}
