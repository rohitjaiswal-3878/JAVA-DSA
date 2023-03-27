package com.BasicJava;

import java.util.Scanner;

public class RotationOfAnotherString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");String str1=sc.nextLine();
        System.out.print("Enter the String 2 : ");String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        String str3=str1+str1;
        if(str1.length() != str2.length()){
            System.out.println("the string 2 is not rotation of string 1.");
        }
        else{
            System.out.println(str3.indexOf(str2) == -1 ? "the string 2 is not rotation of string 1" : "the string 2 is rotation of string 1");
        }


    }
}
