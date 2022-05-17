package com.sparta.mc.alogrithms;

public class ArrayMerger {
  public int[] mergeArray( int[] arr1, int[] arr2 ) {
    //create merged array with the length of the two arrays combines to store all their values
    int[] mergedArray = new int[ arr1.length + arr2.length ];
    //create ints to store the value of the current index
    int leftArrayIndex = 0;
    int rightArrayIndex = 0;
    int mergedArrayIndex = 0;

    //while the left array index is lower than the length of the left array (and same for right respectively)
    while ( leftArrayIndex < arr1.length && rightArrayIndex < arr2.length ) {
      //if the current index of the left array, is lower than the current index of the right array
      if ( arr1[ leftArrayIndex ] < arr2[ rightArrayIndex ] ) {
        //set the current index of the merge array, to the value of the current index of the left array
        mergedArray[ mergedArrayIndex ] = arr1[ leftArrayIndex ];
        //increment the current index to move to the next value in the array
        leftArrayIndex++;
      } else { //do the same for the right index
        mergedArray[ mergedArrayIndex ] = arr2[ rightArrayIndex ];
        rightArrayIndex++;
      }
      //increment the current index of the merged array
      mergedArrayIndex++;
    }

    // keep adding all the numbers remaining on the left
    addRemainingFromArray( arr1, mergedArray, leftArrayIndex, mergedArrayIndex );

    // keep adding all the numbers remaining on the right
    addRemainingFromArray( arr2, mergedArray, rightArrayIndex, mergedArrayIndex );

    return mergedArray;
  }

  private void addRemainingFromArray( int[] rightArray, int[] mergedArray, int rightArrayIndex, int mergedArrayIndex ) {
    while ( rightArrayIndex < rightArray.length ) { // while the index of the right array is lower than the length
      mergedArray[ mergedArrayIndex ] = rightArray[ rightArrayIndex ]; //set the value of the current merged array index
      // to the current value of the right array index
      rightArrayIndex++;
      mergedArrayIndex++;
    }
  }
}
