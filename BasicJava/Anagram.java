package com.BasicJava;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String 1 :");String str1=sc.next();
        System.out.print("Enter the String 2 :");String str2=sc.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int count=0;
        if(str1.length() != str2.length()){
            System.out.println("Entered string is not anagram.");
        }else{
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count==str1.length())System.out.print("Entered string is anagram.");
            else System.out.println("Entered string is not anagram.");
        }



    }
}
