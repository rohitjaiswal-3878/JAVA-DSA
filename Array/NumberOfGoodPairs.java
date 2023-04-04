package com.Array;

import java.util.Arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j) count++;
            }
        }
        System.out.println("Input array : "+ Arrays.toString(nums));
        System.out.println("Output : "+count);
    }
}
