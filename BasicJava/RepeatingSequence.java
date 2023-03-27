package com.BasicJava;

import java.util.Scanner;

public class RepeatingSequence {
    static String commonPrefix(String a,String b){
        int n=Math.min(a.length(),b.length());
        for(int i=0;i<n;i++){
            if(a.charAt(i) != b.charAt(i)) return a.substring(0,i);
        }
        return a.substring(0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        a=a.toLowerCase();
        String lrs="";
        int n=a.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<a.length();j++){
                String x=commonPrefix(a.substring(i,n),a.substring(j,n));
                if(x.length()>lrs.length())lrs=x;
            }
        }
        System.out.println(lrs);
    }
}
