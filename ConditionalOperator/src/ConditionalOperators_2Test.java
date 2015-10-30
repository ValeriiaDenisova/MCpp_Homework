import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperators_2Test {

	@Test
	public void test_1_chetvert() {
		int rez = ConditionalOperators_2.fun(4, 5);
		assertEquals(1, rez);
	}
	
	@Test
	public void test_2_chetvert() {
		int rez = ConditionalOperators_2.fun(-2, 3);
		assertEquals(2, rez);
	}
	
	@Test
	public void test_3_chetvert() {
		int rez = ConditionalOperators_2.fun(-3, -2);
		assertEquals(3, rez);
	}
	
	@Test
	public void test_4_chetvert() {
		int rez = ConditionalOperators_2.fun(4, -1);
		assertEquals(4, rez);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_exception_1() {
		ConditionalOperators_2.fun(0, -2);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_exception_2() {
		ConditionalOperators_2.fun(4, 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_exception_3() {
		ConditionalOperators_2.fun(0, 0);
	}

}
