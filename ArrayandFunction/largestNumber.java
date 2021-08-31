package com.ArrayandFunction;

import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        char low = ch[0];
        for (int j = 0; j <str.length(); j++) {
            if(ch[j]<low){
                low = ch[j];
            }
        }

        String ans;
        for (int j = 0; j <str.length(); j++) {

        }

    }
}
