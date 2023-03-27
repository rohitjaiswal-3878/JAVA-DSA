package com.BasicJava;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.next();
        a=a.toLowerCase();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        if(a.equals(rev)) System.out.println("Palindrome String.");
        else System.out.println("Not a palindrome String.");
    }
}
