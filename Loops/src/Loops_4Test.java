import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_4Test {

	@Test
	public void test_fact_1() {
		int fact = Loops_4.fact(1);
		assertEquals(1, fact);
	}
	
	@Test
	public void test_fact_2() {
		int fact = Loops_4.fact(2);
		assertEquals(2, fact);
	}
	
	@Test
	public void test_fact() {
		int fact = Loops_4.fact(7);
		assertEquals(5040, fact);
	}
}
