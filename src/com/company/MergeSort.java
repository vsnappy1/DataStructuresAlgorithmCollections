package com.company;

import java.util.Arrays;

public class MergeSort {


    public void sort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        int m = (l + r) / 2;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

//    private void merge(int[] arr, int l, int m, int r) {
//
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        /* Create temp arrays */
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//
//        /*Copy data to temp arrays*/
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        /* Merge the temp arrays */
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarry array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k++] = L[i++];
//            } else {
//                arr[k++] = R[j++];
//            }
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            arr[k++] = L[i++];
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            arr[k++] = R[j++];
//        }
//    }

    private void merge(int[] arr, int l, int m, int r) {

        int sizeOfLeftArray = m - l + 1;
        int sizeOfRightArray = r - m;

        int[] leftArray = new int[sizeOfLeftArray];
        int[] rightArray = new int[sizeOfRightArray];

        for (int i = 0; i < sizeOfLeftArray; i++)
            leftArray[i] = arr[l + i];

        for (int j = 0; j < sizeOfRightArray; j++)
            rightArray[j] = arr[m + 1 + j];


        int i = 0, j = 0, k = l;

        while (i < sizeOfLeftArray && j < sizeOfRightArray){
            if(leftArray[i] <= rightArray[j])
                arr[k++] = leftArray[i++];
            else
                arr[k++] = rightArray[j++];
        }

        while (i < sizeOfLeftArray)
            arr[k++] = leftArray[i++];

        while (j < sizeOfRightArray)
            arr[k++] = rightArray[j++];

    }
}
