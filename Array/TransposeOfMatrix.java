package com.Array;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int row=matrix.length;
        int col=matrix[0].length;
        System.out.println(row+" "+col);
        int[][] transpose=new int[col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int[] i:transpose){
            System.out.println(Arrays.toString(i));
        }

    }
}
