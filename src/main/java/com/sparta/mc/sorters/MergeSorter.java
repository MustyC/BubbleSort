package com.sparta.mc.sorters;

import static com.sparta.mc.sorters.Merge.merge;

public class MergeSorter implements Sorter {


  public int[] sortArray( int[] unsortedArray, int n ) {
    if ( n < 2 ) {
      return unsortedArray;
    }
    int middleIndex = n / 2;
    int[] leftArray = new int[ middleIndex ];
    int[] rightArray = new int[ n - middleIndex ];

    for ( int i = 0; i < unsortedArray.length; i++ ) {
      leftArray[ i ] = unsortedArray[ i ];
    }
    for ( int i = middleIndex; i < n; i++ ) {
      rightArray[ i - middleIndex ] = unsortedArray[ i ];
    }
    sortArray( leftArray, middleIndex );
    sortArray( rightArray, n - middleIndex );

    return merge( leftArray, rightArray );
  }

  @Override
  public int[] sortArray( int[] inputArray ) {
    return sortArray( inputArray, inputArray.length );
  }
}
