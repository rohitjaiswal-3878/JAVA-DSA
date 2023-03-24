package com.conditionalloops;

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Number of days kunal will play : "+count);
    }
}
