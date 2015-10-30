import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperators_3Test {

	@Test
	public void test_1() {
		int rez = ConditionalOperators_3.fun(1, 2, 3);
		assertEquals(6, rez);
	}
	
	@Test
	public void test_2() {
		int rez = ConditionalOperators_3.fun(-1, 2, 3);
		assertEquals(5, rez);
	}
	
	@Test
	public void test_3() {
		int rez = ConditionalOperators_3.fun(1, -2, 3);
		assertEquals(4, rez);
	}
	
	@Test
	public void test_4() {
		int rez = ConditionalOperators_3.fun(1, 2, -3);
		assertEquals(3, rez);
	}
	
	@Test
	public void test_5() {
		int rez = ConditionalOperators_3.fun(-1, -2, -3);
		assertEquals(0, rez);
	}

}
