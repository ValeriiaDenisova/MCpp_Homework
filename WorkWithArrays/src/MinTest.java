import static org.junit.Assert.*;

import org.junit.Test;

public class MinTest {
	
	Alist0 alist = new Alist0();

	@Test
	public void testFun_min_1() {
		int[] arr = {2, 3, 5};
		alist.a = arr;
		int min = alist.fun_min();	
		assertEquals(2, min);
	}
	
	@Test
	public void testFun_min_2() {
		int[] arr = {2};
		alist.a = arr;
		int min = alist.fun_min();	
		assertEquals(2, min);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFun_min_0() {
		int[] arr = {};
		alist.a = arr;
		alist.fun_min();	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testFun_min_null() {
		int[] arr = null;
		alist.a = arr;
		alist.fun_min();	
	}

	@Test
	public void testFun_min_i() {
		int[] arr = {2, 3, 5};
		alist.a = arr;
		int min_i = alist.fun_min_i();	
		assertEquals(0, min_i);
	}

}
