import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_9_SelectTest {

	@Test
	public void test_1() {
		int [] arr = {1};
		int [] exp = {1};
 		int [] act = Arrays_9_Select.select(arr);
		assertArrayEquals(exp, act);
		}

	@Test
	public void test_2() {
		int [] arr = {3, 1};
		int [] exp = {1, 3};
 		int [] act = Arrays_9_Select.select(arr);
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_3() {
		int [] arr = {2, 1, 3, 5, 4};
		int [] exp = {1, 2, 3, 4, 5};
 		int [] act = Arrays_9_Select.select(arr);
		assertArrayEquals(exp, act);
		}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_4() {
		int [] arr = {};
 		Arrays_9_Select.select(arr);
		}

}
