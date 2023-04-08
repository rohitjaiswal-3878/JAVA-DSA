package com.Array;

public class MinimumCost {
    public static void main(String[] args) {
        int[] position={2,2,2,3,3};
        int odd=0,even=0;
        for(int i:position){
            if(i%2==1) ++odd;
            else ++even;
        }
        System.out.println("Output : "+Math.min(odd,even));
    }
}

