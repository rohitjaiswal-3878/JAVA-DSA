package com.conditionalloops;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("English : ");float eng = sc.nextFloat();
        System.out.println("Hindi : ");float hin = sc.nextFloat();
        System.out.println("Maths : ");float mat = sc.nextFloat();
        System.out.println("Science : ");float sci = sc.nextFloat();
        System.out.println("SocialStudy : ");float soc = sc.nextFloat();
        float cgpa  = (eng + hin + mat + sci + soc)/5;
        float cgpaper = (float) (cgpa * 9.5);
        System.out.println("percentage : "+cgpaper);
    }
}
