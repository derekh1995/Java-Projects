package a29;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Assignment29 {
    
	public static boolean hasDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
	

	@Test
	public void Test1() {
		int[] array = {1, 2, 3, 4, 4};
		assertTrue(hasDuplicates(array));
		if ((hasDuplicates(array)) == true) {
			System.out.println("Test 1 Has Duplicates");
		}
	}
	
	@Test
	public void Test2() {
		int[] array = {-1, -2, -3, -4};	
		assertFalse(hasDuplicates(array));
		if ((hasDuplicates(array)) == false) {
			System.out.println("Test 2 Has No Duplicates");
		}
	}
	
	@Test
	public void Test3() {
		int[] array = {1, 1, 9, 5};
		assertTrue(hasDuplicates(array));
		if ((hasDuplicates(array)) == true) {
			System.out.println("Test 3 Has Duplicates");
		}
	}
}
