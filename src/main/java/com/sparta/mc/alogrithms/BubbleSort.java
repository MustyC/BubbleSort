package com.sparta.mc.alogrithms;

public class BubbleSort {
  public static int[] bubbleSort( int[] sortArray ) { //returning array, taking in array as parameter

    //iterative for loop. works over every element in the array
    for ( int i = 0; i < sortArray.length; i++ ) {

      //nested for loop. starts from the first element of the array till the second last index
      //uses second last index as after the first time the loop runs, the largest element will always be at the end
      for ( int j = 0; j < sortArray.length - 1 - i; j++ ) {

        // checks that if the element on the left is greater than that on the right. If so, swaps the two elements.
        if ( sortArray[ j + 1 ] < sortArray[ j ] ) { //checks if the current index + 1 in less than the current index
          int swap = sortArray[ j ]; // sets the current index, to int swap
          sortArray[ j ] = sortArray[ j + 1 ]; // sets the current index, to the next number which is smaller
          sortArray[ j + 1 ] = swap; // sets the larger number to the smaller number
        }
      }
    }
    return sortArray;
  }

}
