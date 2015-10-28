import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_2_4Test {

	@Test
	public void testFun_max() {
		int[] arr = {2, 3, 5};
		int max = Arrays_2_4.fun_max(arr);	
		assertEquals(5, max);
	}

	@Test
	public void testFun_max_i() {
		int[] arr = {2, 3, 5};
		int max_i = Arrays_2_4.fun_max_i(arr);	
		assertEquals(2, max_i);
	}

}
