package com.sparta.mc.alogrithms;

public class Merge {
  public static void merge( int[] unsortedArray, int[] leftArray, int[] rightArray, int left, int right ) {

    int i = 0;
    int j = 0;
    int k = 0;

    while ( i < left && j < right ) {
      if ( leftArray[ i ] <= rightArray[ j ] ) {
        unsortedArray[ k++ ] = leftArray[ i++ ];
      } else {
        unsortedArray[ k++ ] = rightArray[ j++ ];
      }
    }

    while ( i < left ) {
      unsortedArray[ k++ ] = leftArray[ i++ ];
    }

    while ( j < right ) {
      unsortedArray[ k++ ] = rightArray[ j++ ];
    }

  }
}

