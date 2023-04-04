package com.Array;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int row=image.length;
        int col=image[0].length;
        int[][] ans = new int[row][col];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                ans[i][j]=image[i][image[i].length-1-j];
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }else{
                    ans[i][j]=0;
                }
            }
        }
        System.out.println("Input 2d Array : ");
        for(int[] i:image){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Output : ");
        for(int[] i:ans){
            System.out.println(Arrays.toString(i));
        }
    }
}
