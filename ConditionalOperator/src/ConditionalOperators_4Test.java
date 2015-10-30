import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperators_4Test {

	@Test
	public void test_1() {
		int rez = ConditionalOperators_4.fun(5, 5, 5);
		assertEquals(128, rez);
	}
	
	@Test
	public void test_2() {
		int rez = ConditionalOperators_4.fun(1, 1, 1);
		assertEquals(6, rez);
	}

}
