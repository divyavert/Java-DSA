package com.sortingAlgorithms;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int arr[] ={7,5,8,4,6,2,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void swap (int[] arr,int max,int last ){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
