package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMaximumCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");String a=sc.nextLine();
        char[] ch=a.toCharArray();
        int[] freq=new int[a.length()];
        for(int i=0;i<a.length();i++){
            freq[i]=1;
            for(int j=i+1;j<a.length();j++){
                if(ch[i] == ch[j] && ch[i]!=' ' && ch[i]!='0'){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(ch));

        int min,max;
        char minChar=' ',maxChar=' ';
        min=max=freq[0];
        for(int i=0;i<freq.length;i++){
            if(min > freq[i] && ch[i] != '0' && ch[i] != ' '){
                min=freq[i];
                minChar=ch[i];
            }
            if(max < freq[i] && ch[i] != '0' && ch[i] != ' '){
                max=freq[i];
                maxChar=ch[i];
            }
        }
        System.out.println("Minimum Occuring character : "+minChar+" "+min);
        System.out.println("Maximum Occuring character : "+maxChar+" "+max);



    }
}
