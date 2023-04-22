package com.String;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        String[] words=s.split(" ");
        String[] pos= new String[words.length];
        for(String i:words){
            int a=Character.getNumericValue(i.charAt(i.length()-1));
            pos[a-1]=i.substring(0,i.length()-1);
        }
        String ans="";
        for(int i=0;i<pos.length;i++){
            ans+=pos[i]+" ";
        }
        System.out.println("Output : "+ans.substring(0,ans.length()-1));
    }
}
