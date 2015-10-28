import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_1Test {

	@Test
	public void test_sum() {
		int sum = Loops_1.sum();
		assertEquals(2450, sum);
	}

	@Test
	public void test_quantity() {
		int quantity = Loops_1.quantity();
		assertEquals(50, quantity);
	}
}
