package com.Array;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        int[] ans=new int[accounts.length];
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int add=0;
            for(int j=0;j<accounts[i].length;j++){
                add+=accounts[i][j];
            }
            ans[i]=add;
        }
        max=ans[0];
        for(int k=0;k<ans.length;k++){
            if(max<ans[k]){
                max=ans[k];
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(Arrays.toString(accounts[i]));
        }
        System.out.println("\nhighest wealth : "+max);
    }
}
