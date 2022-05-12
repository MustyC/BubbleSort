import com.sparta.mc.alogrithms.MergeArraySorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeArraySorterTest {
  @Test
  public void arrayMergeTest() {
    int[] expected = new int[]{ 1, 3, 5, 7, 9, 11, 13, 15, 17, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
    int[] result = MergeArraySorter.ArrayMerge( new int[]{ 1, 3, 5, 7, 9, 11, 13, 15, 17 }, new int[]{ 2, 4, 6, 8, 10, 12, 14, 16, 18 } );
    Assertions.assertArrayEquals( expected, result );
  }
}
