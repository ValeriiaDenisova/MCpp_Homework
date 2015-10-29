import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperators_5Test {

	@Test
	public void test_F() {
		String ochenka = ConditionalOperators_5.fun(10);
		assertEquals("F", ochenka);
	}
	
	@Test
	public void test_E() {
		String ochenka = ConditionalOperators_5.fun(30);
		assertEquals("E", ochenka);
	}
	
	@Test
	public void test_D() {
		String ochenka = ConditionalOperators_5.fun(50);
		assertEquals("D", ochenka);
	}
	
	@Test
	public void test_C() {
		String ochenka = ConditionalOperators_5.fun(70);
		assertEquals("C", ochenka);
	}
	
	@Test
	public void test_B() {
		String ochenka = ConditionalOperators_5.fun(80);
		assertEquals("B", ochenka);
	}
	
	@Test
	public void test_A() {
		String ochenka = ConditionalOperators_5.fun(95);
		assertEquals("A", ochenka);
	}
	
	@Test (expected = NumberFormatException.class)
	public void test_exception_1() {
		ConditionalOperators_5.fun(120);
	}
	
	@Test (expected = NumberFormatException.class)
	public void test_exception_2() {
		ConditionalOperators_5.fun(-10);
	}

}
