package com.BasicJava;

import java.util.Arrays;

public class ArrayDuplicateRemov3 {
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,40,50,50};
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int k=i+1;k<arr.length;k++){
                if(arr[i]==arr[k] && arr[k]!=-1){
                    temp[j++]=arr[i];
                    arr[k]=-1;
                    count++;
                }
            }
            if(count==0 && arr[i] !=-1) temp[j++]=arr[i];
        }
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
