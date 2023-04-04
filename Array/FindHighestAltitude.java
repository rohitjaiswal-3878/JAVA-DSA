package com.Array;

import java.util.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain={-4,-3,-2,-1,4,3,2};
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=gain[j];
            }
            ans[i]=sum;
        }
        int max=ans[0];
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];
            }
        }
        System.out.println("Input Array :"+ Arrays.toString(gain));
        System.out.println("Answer Array : "+Arrays.toString(ans));
        System.out.println("Output : "+max);
    }
}
