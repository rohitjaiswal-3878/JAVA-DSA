package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        a=a.toLowerCase();
        String[] str=a.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
            int count=1;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j]) && !str[i].equals("0")){
                    count++;
                    str[j]="0";
                }
            }
            if(count>1 && str[i] != "0"){
                System.out.println(str[i]);
            }
        }
    }
}
