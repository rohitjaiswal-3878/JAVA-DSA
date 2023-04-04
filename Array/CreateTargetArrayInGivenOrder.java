package com.Array;

import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        int[] target=new int[nums.length];
        for(int i=0;i<index.length;i++){
            int ind=index[i];
            if(target[ind] >= 0){
                for(int j=target.length-2;j>=ind;j--){
                    target[j+1]=target[j];
                }
            };
            target[ind]=nums[i];
        }
        System.out.println("Input Array : "+Arrays.toString(nums));
        System.out.println("Index Array : "+Arrays.toString(index));
        System.out.println("Target Array : "+ Arrays.toString(target));
    }
}
