package com.Array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min > matrix[i][j]){
                    min=matrix[i][j];
                    col=j;
                }
            }
            int max=matrix[0][col];
            for(int k=0;k<matrix.length;k++){
                if(max < matrix[k][col]){
                    max=matrix[k][col];
                }
            }
            if(max==min){
                ans.add(max);
            }
        }
        System.out.println("lucky number : "+ans.get(0));
    }
}
