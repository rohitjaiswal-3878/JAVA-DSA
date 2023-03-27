package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        a=a.toLowerCase();
        int[] freq=new int[a.length()];
        char[] str=a.toCharArray();
        for(int i=0;i<a.length();i++){
            freq[i]=1;
            for(int j=i+1;j<a.length();j++){
                if(str[i]==str[j] && str[i] != '0'){
                    freq[i]++;
                    str[j]='0';
                }
            }
        }
        System.out.println("Duplicate Characters present in the string entered.");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println(str[i]);
            }
        }
    }
}
