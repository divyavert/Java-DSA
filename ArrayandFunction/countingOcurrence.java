package com.ArrayandFunction;

import java.util.Scanner;

public class countingOcurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
       int a = in.nextInt();
        System.out.println("enter counting number");
        int b = in.nextInt();
        int count = 0;

     while (a>0){
        if (a%10 == b ){
            count++;
        }
         a = a/10;}

        System.out.println(count);
    }
}
