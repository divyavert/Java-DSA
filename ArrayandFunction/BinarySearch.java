package com.ArrayandFunction;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int traget = 7;
        System.out.println(search(arr,traget));

    }
   static int search(int[] arr,int traget){
        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int mid = s + (e-s)/2;
            if (traget<arr[mid]){
                e = mid-1;
            }else if(traget>arr[mid]){
                s = mid +1;
            }else if (traget == arr[mid]){
                return mid;
            }
        }

        return -1;
   }
}
