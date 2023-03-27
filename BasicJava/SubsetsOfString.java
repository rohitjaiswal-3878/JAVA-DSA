package com.BasicJava;

import java.util.Scanner;

public class SubsetsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        int temp=0;
        String[] str=new String[a.length()*(a.length()+1)/2];
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                str[temp]=a.substring(i,j+1);
                temp++;
            }
        }
        for(String i:str){
            System.out.print(i+" ");
        }
    }

}
