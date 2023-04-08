package com.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={9,8,9};
        int i=digits.length-1;
        while(i>=0 && digits[i]==9){
            i--;
        }
        if(i==-1 ){
            int[] result = new int[digits.length+1];
            result[0]=1;
            System.out.println(Arrays.toString(result));
        }
        else {
            int[] result = new int[digits.length];
            result[i] = digits[i] + 1;
            for (int j = 0; j < i; j++) {
                result[j] = digits[j];
            }
            System.out.println(Arrays.toString(result));
        }


    }
}
