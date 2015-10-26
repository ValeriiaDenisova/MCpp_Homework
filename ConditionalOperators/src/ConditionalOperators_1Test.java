import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalOperators_1Test {

	@Test
	public void test_1() {
		int rez = ConditionalOperators_1.fun(4, 2);
		assertEquals(8, rez);
	}
	
	@Test
	public void test_2() {
		int rez = ConditionalOperators_1.fun(3, 2);
		assertEquals(5, rez);
	}

}
