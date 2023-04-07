package com.Array;

import java.util.Arrays;

public class N_Unique_Integer_Sum_Up_To_Zero {
    public static void main(String[] args) {
        int n=9;
        int[] ans = new int[n];
        for(int i=1;i<=n/2;i++){
            ans[i-1]=i;
            ans[i+(n/2)-1]=-i;
        }
        System.out.println("Input value : "+n);
        System.out.println("Output Array :"+ Arrays.toString(ans));
    }
}
