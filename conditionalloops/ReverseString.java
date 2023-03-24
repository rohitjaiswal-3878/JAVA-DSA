package com.conditionalloops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string : ");String r=sc.next();
        String ans="";
        for(int i=r.length()-1;i>=0;i--){
            char c=r.trim().charAt(i);
            ans+=c;
        }
        System.out.println(ans);
    }
}
