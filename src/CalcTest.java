import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test_plus() {
		int rez = Calc.calc(2, 3, '+');
		assertEquals(5, rez);
	}

	@Test
	public void test_minus() {
		int rez = Calc.calc(2, 3, '-');
		assertEquals(-1, rez);
	}

	@Test
	public void test_mult() {
		int rez = Calc.calc(2, 3, '*');
		assertEquals(6, rez);
	}

	@Test
	public void test_delen() {
		int rez = Calc.calc(6, 3, '/');
		assertEquals(2, rez);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_exceptio_1() {
		Calc.calc(6, 3, '=');
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_exceptio_2() {
		Calc.calc(6, 3, '&');
	}

	@Test(expected = ArithmeticException.class)
	public void test_exceptio_3() {
		Calc.calc(6, 0, '/');
	}

}
