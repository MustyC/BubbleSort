package com.sparta.mc.runner;

import com.sparta.mc.BubbleSort;

public class Runner {
  public static void main( String[] args ) {
    int[] intArray = { 1, 4, 5, 8, 6, 3, 11, 2, 14, 6, 45, 23, 34, 35, 12, 12, 56, 23, 27, 16, 14, -5, -12, -27, 0 };
    BubbleSort.bubbleSort( intArray );

    for ( int i = 0; i < intArray.length; i++ ) {
      System.out.print( intArray[ i ] + ", " );
    }

    


  }
}
