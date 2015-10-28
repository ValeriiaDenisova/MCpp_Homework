import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_6Test {

	@Test
	public void test() {
		char[] revers = Loops_6.revers("123");
		assertEquals("321", revers);
	}

}
