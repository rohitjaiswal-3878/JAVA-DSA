package com.firstjava;

import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the name of yours : ");
        String a=sc.nextLine();
        System.out.println("hey "+a+" welcome to java world.");
    }
}
