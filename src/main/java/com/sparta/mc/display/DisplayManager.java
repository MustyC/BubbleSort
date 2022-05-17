package com.sparta.mc.display;

import com.sparta.mc.sorters.BubbleSorter;
import com.sparta.mc.sorters.MergeSorter;
import com.sparta.mc.sorters.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
  public static ArrayList< String > getMenuItems() {
    return new ArrayList<>( Arrays.asList( "BubbleSorter", "MergeSorter", "BinarySorter" ) );
  }

  public static void printBeforeSort( Sorter sorter, int[] arrayToSort ) {
    System.out.println( "Sorting using the " + sorter );
    System.out.println( "Before sorting: \n" + Arrays.toString( arrayToSort ) );
  }

  public static void printResult( Sorter sorter, int[] arrayToSort ) {
    long start = System.nanoTime();
    int[] sortedArray = sorter.sortArray( arrayToSort );
    long end = System.nanoTime();
    System.out.println( "After sorting: \n" + Arrays.toString( sortedArray ) );
    System.out.println( "Time taken: " + ( end - start ) + " nano seconds." );
  }

  public static void displaySortChoices() {
    System.out.println( "Enter the number of the sorter you wish to use: " );
    for ( int j = 0; j < getMenuItems().size(); j++ ) {
      System.out.println( j + 1 + ". " + getMenuItems().get( j ) );
    }
  }
}
