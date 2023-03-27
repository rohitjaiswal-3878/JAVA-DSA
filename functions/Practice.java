package com.functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Practice {
    static boolean isPrime(long a){
        int c=2;
        while(c*c < a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
    }
    static boolean isPalindrome(long a){
        long sum=0;
        long temp=a;
        while(temp!=0){
            long rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        return sum==a;
    }
    static String moveForward(int k, String s){
        if(k >= s.length())
            return "";
        String word = "";
        int i;
        for(i = k; i < s.length() && s.charAt(i) != '.'; i++)
            word += s.charAt(i);

        System.out.println(word);
        return moveForward(i+1, s) + '.' + word;
    }
    static String reverseWords(String s)
    {
        // code here
        return moveForward(0, s);

    }
    public static void main(String[] args) {
        String s="I.am.ro";
//        String s2="";
//        int last=s.length();
//        for(int i=s.length()-1;i>=0;i--){
//            if(s.charAt(i)=='.'){
//                s2=s2+s.substring(i+1,last)+".";
//                last=i;
//            }
//        }
//        s2=s2+s.substring(0,last);
//        System.out.println(s2);
        reverseWords(s);
  }
}
