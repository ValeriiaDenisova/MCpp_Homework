import static org.junit.Assert.*;

import org.junit.Test;

public class MaxTest {
	
	Alist0 alist = new Alist0();

	@Test
	public void testFun_max() {
		int[] arr = {2, 3, 5};
		alist.a = arr;
		int max = alist.fun_max(arr);	
		assertEquals(5, max);
	}

	@Test
	public void testFun_max_i() {
		int[] arr = {2, 3, 5};
		alist.a = arr;
		int max_i = alist.fun_max_i(arr);	
		assertEquals(2, max_i);
	}

}
