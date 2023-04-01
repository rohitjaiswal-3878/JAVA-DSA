package com.Array;

import java.util.Arrays;

public class RunningSumOf_1d_Array {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        System.out.println("input array : "+Arrays.toString(nums));
        System.out.println("output array : "+Arrays.toString(ans));
    }
}
