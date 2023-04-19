import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversedInPlace2(){
    int[] input1 = {2,3,4}; 
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2}, input1);
  }

  @Test 
  public void testReversed2(){
    int[] input1 = {2,3,4}; 
    assertArrayEquals(new int[]{4,3,2}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAvLowest(){
    double[] input1 = {5.0,5.0,5.0,5.0}; 
    double result = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(result, 5, 0.0001);
  }

}


