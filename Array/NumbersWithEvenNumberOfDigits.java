package com.Array;

import java.util.Arrays;

public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int ans=0;
        int nums[] ={12,345,2,6,7896};
        System.out.println("Input Array : "+ Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                sum+=1;
                nums[i]=nums[i]/10;
            }
            if(sum%2==0){
                ans++;
            }
        }
        System.out.println("Output Array  : "+ans);
    }
}
