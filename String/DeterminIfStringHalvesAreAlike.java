package com.String;

public class DeterminIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s="book";
        String a=s.substring(0,s.length()/2).toLowerCase();
        String b=s.substring(s.length()/2,s.length()).toLowerCase();
        int count1=0,count2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                count1++;
            }
            if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u'){
                count2++;
            }
        }
        System.out.println("Output : "+(count1==count2));
    }
}
