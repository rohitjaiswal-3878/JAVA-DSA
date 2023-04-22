package com.String;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        String s="10#11#26#123";
        char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String n;
        String ans="";
        int i=0;
        while(i<s.length()-2){
            if(s.charAt(i+2)=='#'){
                ans+=ch[Integer.parseInt(s.substring(i,i+2))-1];
                i=i+3;
            }else{
                ans+=ch[Integer.parseInt(s.substring(i,i+1))-1];
                i++;
            }
        }
        while(i<s.length()){
            ans+=ch[Integer.parseInt(s.substring(i,i+1))-1];
            i++;
        }

        System.out.println("Output : "+ans);
    }
}
