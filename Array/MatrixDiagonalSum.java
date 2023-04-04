package com.Array;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int ans=0;
        for(int i=0;i<mat.length;i++){
            ans+=mat[i][i];
            ans+=mat[i][mat.length-1-i];
            if(mat[i][i]==mat[i][mat.length-1-i] && mat.length%2==1 && (mat.length/2)==i){
                ans-=mat[i][i];
            }
        }
        System.out.println("Output : "+ans);
    }
}
