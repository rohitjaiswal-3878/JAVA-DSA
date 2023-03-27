package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStringInNParts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string : ");String str=sc.next();
        System.out.print("enter the n value : ");int n=sc.nextInt();
        String[] strdivided=new String[n];
        if(str.length()%n!=0){
            System.out.print("the String cant be divided into "+n+" parts");
        }else{
            int j=0;
            for(int i=0;i<str.length();i=i+str.length()/n){
                strdivided[j]=str.substring(i,i+str.length()/n);
                j++;
            }
        }
        System.out.println("the string is divided into "+n+" equal parts.");
        for(String k:strdivided){
            System.out.println(k);
        }
    }
}
