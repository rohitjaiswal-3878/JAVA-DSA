package com.Array;

import java.util.Arrays;

public class MatrixObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        int row=mat.length;
        int len=row*mat[0].length;
        int c=0;
        boolean flag=false;
        while(c!=4){
            for(int i=0;i<mat.length;i++){
                for(int j=i;j<mat[i].length;j++){
                    if(j!=i){
                        int temp=mat[i][j];
                        mat[i][j]=mat[j][i];
                        mat[j][i]=temp;
                    }
                }
            }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length/2;j++){
                    int temp=mat[i][j];
                    mat[i][j]=mat[i][mat.length-1-j];
                    mat[i][mat.length-1-j]=temp;
                }
            }
            int count=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j]==target[i][j]){
                        count++;
                    }
                }
            }
            if(count==len){
                flag=true;
            }
            c++;
        }
        System.out.println("Matrix : ");
        for(int[] i:mat){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Target Matrix : ");
        for(int[] i:target){
            System.out.println(Arrays.toString(i));
        }
        System.out.print(flag);
    }
}
