package com.BasicJava;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        a=a.replace(' ','-');
        System.out.println(a);
    }
}
