package com.String;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        String ans="";
        String[] ns=s.split(" ");
        for(int i=0;i<ns.length;i++){
            for(int j=ns[i].length()-1;j>=0;j--){
                ans+=ns[i].charAt(j);
            }
            ans+=" ";
        }
        System.out.println("Output : "+ans.substring(0,ans.length()-1));
    }
}
