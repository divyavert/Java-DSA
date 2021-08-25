package com.ArrayandFunction;

public class functionPractice {
    public static void main(String[] args) {
        int a = 10;

        {
            a = 133;
            change(a);
            System.out.println(a);
        }
    }

    static void change(int a){
        a = 233;
        System.out.println(a);
    }
}
