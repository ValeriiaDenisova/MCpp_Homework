import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_6Test {

	@Test
	public void test_1() {
		int revers = Loops_6.revers("1");
		assertEquals(1, revers);
	}

	@Test
	public void test_2() {
		int revers = Loops_6.revers("123");
		assertEquals(321, revers);
	}

	@Test(expected = NumberFormatException.class)
	public void test_3() {
		Loops_6.revers("qqq");
	}

}
