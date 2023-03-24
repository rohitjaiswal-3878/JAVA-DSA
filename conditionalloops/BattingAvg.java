package com.conditionalloops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int inn,out;double avg;
        System.out.println("Enter the total number of matches : ");int matchs=sc.nextInt();
        while(true){
            System.out.println("enter the number of innings : ");inn=sc.nextInt();
            if(inn<=matchs){
                break;
            }
            System.out.println("Enter the innings properly inning <= matches ");
        }
        while(true){
            System.out.println("enter the number of not out : ");out=sc.nextInt();
            if(out<=inn){
                break;
            }
            System.out.println("Enter the not-outs properly  not-outs <= innings ");
        }
        System.out.println("enter the number of runs : ");int runs = sc.nextInt();
        if(inn==out){
            avg = runs;
        }
        else {
            avg=runs/(inn-out);
        }
        System.out.println("Average Battings : "+avg);
    }
}

