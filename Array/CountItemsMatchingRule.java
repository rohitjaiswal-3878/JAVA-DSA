package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items= new ArrayList<List<String>>();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");
        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");
        l3.add("phone");
        l3.add("gold");
        l3.add("iphone");
        items.add(l1);
        items.add(l2);
        items.add(l3);
        String ruleKey="color";
        String ruleValue="silver";
        int count=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue)) count++;
            }else if(ruleKey.equals("color")){
                if(items.get(i).get(1).equals(ruleValue)) count++;
            }else{
                if(items.get(i).get(2).equals(ruleValue)) count++;
            }
        }
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
        System.out.println("Only "+count+" is present");
    }
}
