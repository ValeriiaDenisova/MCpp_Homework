import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_1_3Test {

	@Test
	public void testFun_min_1() {
		int[] arr = {2, 3, 5};
		int min = Arrays_1_3.fun_min(arr);	
		assertEquals(2, min);
	}
	
	@Test
	public void testFun_min_2() {
		int[] arr = {2};
		int min = Arrays_1_3.fun_min(arr);	
		assertEquals(2, min);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFun_min_0() {
		int[] arr = {};
		int min = Arrays_1_3.fun_min(arr);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFun_min_null() {
		int[] arr = null;
		int min = Arrays_1_3.fun_min(arr);	
	}

	@Test
	public void testFun_min_i() {
		int[] arr = {2, 3, 5};
		int min_i = Arrays_1_3.fun_min_i(arr);	
		assertEquals(0, min_i);
	}

}
