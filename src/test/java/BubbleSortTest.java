import com.sparta.mc.alogrithms.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  @Test
  @Disabled
  public void bubbleSortTest1() {
    // Given
    int[] expected = new int[]{ 1, 4, 5, 8, 6, 3, 11, 2, 14, 6, 45, 23, 34, 35, 12, 12, 56, 100, 23, 27, 16, 14, -5, -12, -27, 0 };
    // When
    int[] result = BubbleSort.bubbleSort( new int[]{ -27, -12, -5, 0, 1, 2, 3, 4, 5, 6, 6, 8, 11, 12, 12, 14, 14, 16, 23, 23, 27, 34, 35, 45, 56, 100 } );
    // Then
    Assertions.assertArrayEquals( result, expected );
  }
}
