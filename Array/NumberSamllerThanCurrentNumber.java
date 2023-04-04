package com.Array;

import java.util.Arrays;

public class NumberSamllerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i] && j!=i){
                    count++;
                }
            }
            ans[i]=count;
        }
        System.out.println("Input Array : "+ Arrays.toString(nums));
        System.out.println("Output Array : "+ Arrays.toString(ans));

    }
}
