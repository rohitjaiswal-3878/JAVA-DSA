package com.Array;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs={{1993,1999},{2000,2010}};
        int[] persons =  new int[101];
        for(int i = 0; i < logs.length; i++) {
            int start = logs[i][0];
            int end = logs[i][1];
            for(int j = start - 1950; j < end - 1950; j++) {
                persons[j]++;
            }
        }
        int result=-1;
        int year=-1;
        for(int i=0;i<101;i++){
            if(persons[i]>result){
                result=persons[i];
                year=i;
            }
        }
        System.out.println(year+1950);
    }
}
