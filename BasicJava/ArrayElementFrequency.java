package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            freq[i]=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=-1){
                    freq[i]++;
                    arr[j]=-1;
                }
            }
        }
        System.out.println("duplicate elements : ");
        for(int i=0;i<freq.length;i++){
            if(arr[i]!=-1 && freq[i]>=1 ){
                System.out.println(arr[i]+" | "+freq[i]);
            }
        }
    }
}
