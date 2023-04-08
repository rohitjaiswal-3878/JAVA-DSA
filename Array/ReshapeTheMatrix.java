package com.Array;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r=1,c=4;
        int row=mat.length;
        int col=mat[0].length;
        if(r*c!=row*col){
            for(int[] i:mat)
             System.out.println(Arrays.toString(i));
        }
        int[][] ans= new int[r][c];
        int[] d1=new int[row*col];
        int k=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                d1[k]=mat[i][j];
                k++;
            }
        }
        int m=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=d1[m];
                m++;
            }
        }
        for(int[] i : ans)
        System.out.println("Output : "+ Arrays.toString(i));
    }
}
