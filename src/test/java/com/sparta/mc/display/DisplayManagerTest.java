package com.sparta.mc.display;

import com.sparta.mc.sorters.BubbleSorter;
import com.sparta.mc.sorters.MergeSorter;
import com.sparta.mc.sorters.Sorter;
import org.junit.jupiter.api.Test;

public class DisplayManagerTest {
  @Test
  void test() {
    BubbleSorter sorter = new BubbleSorter();
    DisplayManager.printBeforeSort( sorter, new int[]{ 9, 2, 1, 4, 5, 8, 7 } );
    DisplayManager.printResult( sorter, new int[]{ 9, 2, 1, 4, 5, 8, 7 } );
    DisplayManager.displaySortChoices( );
  }

  @Test
  void mergeSorter() {
    MergeSorter sorter = new MergeSorter();
    DisplayManager.printBeforeSort( sorter, new int[]{ 9, 2, 1, 4, 5, 8, 7 } );
    DisplayManager.printResult( sorter, new int[]{ 9, 2, 1, 4, 5, 8, 7 } );
  }

}
