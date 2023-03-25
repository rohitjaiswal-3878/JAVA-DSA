package com.functions;

public class MaxMin {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d,%d,%d : %d \n",1,2,3,max(1,2,3));
        System.out.printf("Minimum of %d,%d,%d : %d",1,2,3,min(1,2,3));

    }
    static int max(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    static int min(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
