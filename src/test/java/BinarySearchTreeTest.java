import com.sparta.mc.alogrithms.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinarySearchTreeTest {

  @Test
  public void evenNumberCheck() {
    int[] actual = { 5, 8, 3, 4, 2, 7 };
    int[] expected = { 2, 3, 4, 5, 7, 8 };
    BinarySearchTree.binaryTreeSort( actual, actual.length );
    assertArrayEquals( expected, actual );
  }
}
