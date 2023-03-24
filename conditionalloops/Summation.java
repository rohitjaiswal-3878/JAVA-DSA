package com.conditionalloops;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nsum=0,osum=0,esum=0;
        System.out.println("enter the numebr : ");
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            } else if (n<0) {
                nsum+=n;
            }else if(n%2==0){
                esum+=n;
            }else{
                osum+=n;
            }
        }
        System.out.println("positive number : "+osum);
        System.out.println("negative number : "+nsum);
        System.out.println("even number : "+esum);

    }
}
