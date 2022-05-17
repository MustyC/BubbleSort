package com.sparta.mc.runner;

import com.sparta.mc.alogrithms.BubbleSort;
import com.sparta.mc.alogrithms.ArrayMerger;

public class Runner {
  public static void main( String[] args ) {


    int[] intArray = { 1, 4, 5, 8, 6, 3, 11, 2, 14, 6, 45, 23, 34, 35, 12, 12, 56, 100, 23, 27, 16, 14, -5, -12, -27, 0 };
    BubbleSort.bubbleSort( intArray );

    for ( int i = 0; i < intArray.length; i++ ) {
      System.out.print( intArray[ i ] + ", " );
    }
    System.out.println( "\n" );

    ArrayMerger arrayMerger= new ArrayMerger();
    int[] intArr1 = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
    int[] intArr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
    int[] mergedArray = new int[ intArr1.length + intArr2.length ];
//    ArrayMerger.ArrayMerger( intArr1, intArr2 );

    for ( int i = 0; i < mergedArray.length; i++ ) {
      System.out.print( mergedArray[ i ] + ", " );

    }
  }
}
