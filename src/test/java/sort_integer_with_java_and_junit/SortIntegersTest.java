package sort_integer_with_java_and_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import sort_integer_with_java.SortIntegers;

public class SortIntegersTest {

	@Test
	public void testSort() {
		int [] intsToSort = {3,1,2};
		int [] expectedIntSorted = {1,2,3};
		SortIntegers.sort(intsToSort);
		assertArrayEquals(expectedIntSorted, intsToSort);
	}

}
