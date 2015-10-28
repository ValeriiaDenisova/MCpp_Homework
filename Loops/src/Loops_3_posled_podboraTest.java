import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_3_posled_podboraTest {

	@Test
	public void test_sqrt() {
		int sqrt = Loops_3_posled_podbora.sqrt(25);
		assertEquals(5, sqrt);
	}
	
	@Test
	public void test_sqrt_2() {
		int sqrt = Loops_3_posled_podbora.sqrt(101);
		assertEquals(11, sqrt);
	}

}
