package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans=new int[2*nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println("input array : "+Arrays.toString(nums));
        System.out.println("output array : "+Arrays.toString(ans));
    }
}
