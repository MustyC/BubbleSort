package com.sparta.mc.alogrithms;

import static com.sparta.mc.alogrithms.Merge.merge;

public class MergeSort {

  public static void mergeSort(int[] unsortedArray, int n){
   if(n < 2){
     return;
   }
    int middleIndex = n/2;
    int[] leftArray = new int[middleIndex];
    int[] rightArray = new int[n - middleIndex];

    for ( int i = 0; i < unsortedArray.length; i++ ) {
    leftArray[i] = unsortedArray[i];
    }
    for ( int i = middleIndex; i < n; i++ ) {
      rightArray[i - middleIndex] = unsortedArray[i];
    }
    mergeSort( leftArray, middleIndex );
    mergeSort( rightArray, n - middleIndex );

    merge(unsortedArray, leftArray, rightArray, middleIndex, n - middleIndex);
  }

}
