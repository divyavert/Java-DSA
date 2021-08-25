package com.ArrayandFunction;

import java.util.Arrays;
import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        
        int x = 121;
        System.out.println( isPalindrome(x));

    }
  static  public boolean isPalindrome(int x) {
        int c = 0;
        int temp = x;
        while (x>0){
            int r = x%10;
            c = c*10 + r;
            x = x/10;
        }
        if (temp == c){
            return true;
        }else{
            return false; }
    }

}
