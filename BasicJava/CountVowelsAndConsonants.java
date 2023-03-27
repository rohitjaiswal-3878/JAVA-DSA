package com.BasicJava;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        int vowels=0,consonants=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' ||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u'){
                vowels++;
            }else{
                if(a.charAt(i)!=' ')consonants++;
            }
        }
        System.out.println("vowels : "+vowels+" consonants :"+consonants);
    }
}
