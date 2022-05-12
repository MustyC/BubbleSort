import com.sparta.mc.alogrithms.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  @Test
  public void bubbleSortTest1() {
    int[] expected = new int[]{ 2, 14, 6, 45, 23, 34, 35, 12, 12, 23, 27, 16, 11, 14, -5, -12, 56, 5 };
    int[] result = BubbleSort.bubbleSort( new int[]{ -12, -5, 2, 5, 6, 11, 12, 12, 14, 14, 16, 23, 23, 27, 34, 35, 45, 56 } );
    Assertions.assertArrayEquals( result, expected );
  }
}
