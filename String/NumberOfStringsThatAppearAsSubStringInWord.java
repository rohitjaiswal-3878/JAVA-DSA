package com.String;

public class NumberOfStringsThatAppearAsSubStringInWord {
    public static void main(String[] args) {
        String[] patterns={"a","abc","bc","d"};
        String word="abc";
        int count=0;
        for(String s:patterns){
            if(word.contains(s)){
                count++;
            }
        }
        System.out.println("Output : "+count);
    }
}
