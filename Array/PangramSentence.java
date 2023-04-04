package com.Array;

import java.util.Arrays;

public class PangramSentence {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        boolean flag=true;
        char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count=0;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<sentence.length();j++){
                if(ch[i]==sentence.charAt(j)){
                    ++count;
                    break;
                }
            }
        }
        System.out.println("Input String : "+ sentence);
        System.out.println("Answer : "+(count==26));
    }
}
