package com.String;

public class CheckIfTwoStringsArraysAreEquivalant {
    public static void main(String[] args) {
        String[] word1={"r","oh","i","t"};
        String[] word2={"ro","h","it"};
        String a="",b="";
        for(String i:word1){
            a+=i;
        }
        for(String i:word2){
            b+=i;
        }
        if(a.equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
