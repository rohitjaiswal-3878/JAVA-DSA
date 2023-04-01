package com.Array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,0};
        int n=5;
        int[] ans= new int[2*n];
        int  j=0;
        for(int i=0;i<ans.length-n;i++){
            ans[j]=nums[i];
            ans[j+1]=nums[i+n];
            j=j+2;
        }
        System.out.println("input array : "+Arrays.toString(nums));
        System.out.println("output array : "+Arrays.toString(ans));    }
}
