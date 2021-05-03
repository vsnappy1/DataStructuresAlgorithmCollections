package com.company;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int value){

        int middleValue = arr.length/2;

        if(arr[middleValue] == value){
            return arr[middleValue];
        }

        if(middleValue == 0){
            return -1;
        }

        if(arr[middleValue] > value){
            return binarySearch(Arrays.copyOfRange(arr,0,middleValue-1), value);
        }
        else {
            return binarySearch(Arrays.copyOfRange(arr,middleValue,arr.length),value);
        }
    }
}
