import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_8Test {

	@Test
	public void test_1() {
		int [] arr = {1};
		int [] exp = {1};
 		int [] act = Arrays_8.change(arr);
		assertArrayEquals(exp, act);
		}

	@Test
	public void test_2() {
		int [] arr = {1, 2};
		int [] exp = {2, 1};
 		int [] act = Arrays_8.change(arr);
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_3() {
		int [] arr = {1, 2, 3, 4, 5};
		int [] exp = {4, 5, 3, 1, 2};
 		int [] act = Arrays_8.change(arr);
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_4() {
		int [] arr = {};
		int [] exp = {};
 		int [] act = Arrays_8.change(arr);
		assertArrayEquals(exp, act);
		}
}
