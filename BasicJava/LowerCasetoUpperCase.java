package com.BasicJava;

import java.util.Scanner;

public class LowerCasetoUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        String str="";
        for(int i=0;i<a.length();i++){
            if(Character.isLowerCase(a.charAt(i))){
                str += String.valueOf(Character.toUpperCase(a.charAt(i)));
            }else if(Character.isUpperCase(a.charAt(i))){
                str += String.valueOf(Character.toLowerCase(a.charAt(i)));
            }else{
                str+=' ';
            }
        }
        System.out.print(str);
    }
}
