package com.BasicJava;

import java.util.Scanner;

public class PunctuationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.' || a.charAt(i)==','  || a.charAt(i)=='-' || a.charAt(i)=='\"' ||a.charAt(i)=='!' || a.charAt(i)=='?' || a.charAt(i)==';' || a.charAt(i)=='\''){
                count++;
            }
        }
        System.out.println(count);
    }
}
