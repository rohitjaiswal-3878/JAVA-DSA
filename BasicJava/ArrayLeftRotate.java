package com.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.print("Enter the number of shifts : ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            System.out.println(temp+" ");
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
