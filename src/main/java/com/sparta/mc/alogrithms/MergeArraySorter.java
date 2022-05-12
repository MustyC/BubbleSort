package com.sparta.mc.alogrithms;

public class MergeArraySorter {
  public static int[] ArrayMerge( int[] arr1, int[] arr2 ) {

    int[] mergedArr = new int[ arr1.length + arr1.length - 2 ];
    for ( int i = 0; i < mergedArr.length - i - 1; i++ ) {
      int swap1 = arr1[ i ];
      int swap2 = arr2[ i ];
      if ( arr1[ i ] < arr2[ i ] ) {
        mergedArr[ i ] = swap1;
        mergedArr[ i + 1 ] = swap2;
      } else {
        mergedArr[ i ] = swap2;
        mergedArr[ i + 1 ] = swap1;
      }
    }
    return mergedArr;
  }
}
