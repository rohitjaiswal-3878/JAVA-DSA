package com.BasicJava;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,0};
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
