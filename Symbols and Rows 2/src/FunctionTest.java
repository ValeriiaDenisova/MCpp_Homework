import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void testFun_1() {
		String str = Function.fun_1(123);
		assertEquals("123", str);
	}

	@Test
	public void testFun_2() {
		String str = Function.fun_2(123.123f);
		assertEquals("123.123", str);
	}

	@Test
	public void testFun_3() {
		int a = Function.fun_3("123");
		assertEquals(123, a);
	}

	@Test
	public void testFun_4() {
		float a = Function.fun_4("123.123");
		assertEquals(123.123, a, 1);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testFun_3_exc() {
		Function.fun_3("123rrr");
	}
	
	@Test(expected = NumberFormatException.class)
	public void testFun_4_exc() {
		Function.fun_4("123rrr");
	}

}
