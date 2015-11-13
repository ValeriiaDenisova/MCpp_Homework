import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {
	
	Alist0 alist = new Alist0();

	@Test
	public void test_1() {
		int [] arr = {1};
		alist.a = arr;
		int [] exp = {1};
 		int [] act = alist.bubble();
		assertArrayEquals(exp, act);
		}

	@Test
	public void test_2() {
		int [] arr = {2, 1};
		alist.a = arr;
		int [] exp = {1, 2};
 		int [] act = alist.bubble();
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_3() {
		int [] arr = {2, 1, 3, 5, 4};
		alist.a = arr;
		int [] exp = {1, 2, 3, 4, 5};
 		int [] act = alist.bubble();
		assertArrayEquals(exp, act);
		}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_4() {
		alist.bubble();
		}

}
