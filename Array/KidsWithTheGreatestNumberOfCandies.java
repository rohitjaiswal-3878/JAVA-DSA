package com.Array;

import java.util.Arrays;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies={2,3,1,5,4};
        int extraCandies=3;
        boolean[] ans= new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            int addExtCan=candies[i]+extraCandies;
            int max=addExtCan;
            for(int j=0;j<candies.length;j++){
                if(max <= candies[j]){
                    max=candies[j];
                }
            }
            if(max==addExtCan){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
