package com.String;

public class ShuffleString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        String ans="";
        char[] arr=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        System.out.println();
        for(char i:arr){
            ans=ans+i;
        }
        System.out.println("Output : "+ans);
    }
}
