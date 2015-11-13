import static org.junit.Assert.*;

import org.junit.Test;

public class HalfReversTest {
	
	Alist0 alist = new Alist0();

	@Test
	public void test_1() {
		int [] arr = {1};
		alist.a = arr;
		int [] exp = {1};
 		int [] act = alist.half_revers();
		assertArrayEquals(exp, act);
		}

	@Test
	public void test_2() {
		int [] arr = {1, 2};
		alist.a = arr;
		int [] exp = {2, 1};
		int [] act = alist.half_revers();
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_3() {
		int [] arr = {1, 2, 3, 4, 5};
		alist.a = arr;
		int [] exp = {4, 5, 3, 1, 2};
		int [] act = alist.half_revers();
		assertArrayEquals(exp, act);
		}
	
	@Test
	public void test_4() {
		int [] arr = {};
		alist.a = arr;
		int [] exp = {};
		int [] act = alist.half_revers();
		assertArrayEquals(exp, act);
		}

}
