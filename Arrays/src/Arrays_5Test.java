import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_5Test {

	@Test
	public void test_1() {
		int [] arr = {1};
		int sum = Arrays_5.sum(arr);
		assertEquals(0, sum);
	}
	
	@Test
	public void test_2() {
		int [] arr = {1, 2};
		int sum = Arrays_5.sum(arr);
		assertEquals(2, sum);
	}
	
	@Test
	public void test_5() {
		int [] arr = {1, 2, 3, 4, 5};
		int sum = Arrays_5.sum(arr);
		assertEquals(6, sum);
	}

}
