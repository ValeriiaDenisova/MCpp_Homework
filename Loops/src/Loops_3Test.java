import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_3Test {

	@Test
	public void test_1() {
		int sqrt = Loops_3.sqrt(100);
		assertEquals(10, sqrt);
	}
	
	@Test
	public void test_2() {
		int sqrt = Loops_3.sqrt(101);
		assertEquals(10, sqrt);
	}
	
	@Test (expected = ArithmeticException.class)
	public void test_3() {
		Loops_3.sqrt(0);
	}

}
