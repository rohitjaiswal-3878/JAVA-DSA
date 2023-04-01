package com.BasicJava;

public class ArrayLargestElements {
    public static void main(String[] args) {
        int[] arr={1,2,232,121,667,12};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("largest : "+max);
        System.out.println("Smallest : "+min);
    }
}
