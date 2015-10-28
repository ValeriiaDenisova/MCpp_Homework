import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_4Test {

	@Test
	public void test_fact() {
		int fact = Loops_4.fact(5);
		assertEquals(120, fact);
	}
}
