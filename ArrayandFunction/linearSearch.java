package com.ArrayandFunction;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int traget = 19;

      int ans =  search(arr,traget);

        System.out.println(ans);
        
    }
    static int search(int[] arr,int traget){
        if (arr.length == 0){

            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == traget){
                return i;
            }
        }

        return -1;
    }

}
