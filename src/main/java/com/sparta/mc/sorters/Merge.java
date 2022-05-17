package com.sparta.mc.sorters;

public class Merge {
  public static int[] merge( int[] leftArray, int[] rightArray ) {

    int i = 0;
    int j = 0;
    int k = 0;
    int[] mergedArray = new int[ leftArray.length + rightArray.length ];
    int left = 0;
    int right = 0;

    while ( i < left && j < right ) {
      if ( leftArray[ i ] <= rightArray[ j ] ) {
        mergedArray[ k++ ] = leftArray[ i++ ];
      } else {
        mergedArray[ k++ ] = rightArray[ j++ ];
      }
    }

    while ( i < left ) {
      mergedArray[ k++ ] = leftArray[ i++ ];
    }

    while ( j < right ) {
      mergedArray[ k++ ] = rightArray[ j++ ];
    }
    return mergedArray;
  }
}

