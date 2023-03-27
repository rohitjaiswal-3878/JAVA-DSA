package com.BasicJava;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        String Str="";
        a=a.replaceAll("\\s+","-");
        System.out.println(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='-'){
                Str+=a.charAt(i);
            }
        }
        System.out.println(Str);
    }
}
