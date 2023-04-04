package com.Array;

import java.util.Arrays;

public class CellsWithOddValueInMatrix {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        int m= 2,n=3;
        int[][] ans=new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[i].length;j++){
                if(j==0){
                    for(int k=0;k<n;k++){
                        ans[indices[i][j]][k]+=1;
                    }
                }else{
                    for(int k=0;k<m;k++){
                        ans[k][indices[i][j]]+=1;
                    }
                }
            }
        }
        int odd=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                if(ans[i][j]%2==1){
                    odd++;
                }
            }
        }
        System.out.println("Output : "+odd);
    }
}
