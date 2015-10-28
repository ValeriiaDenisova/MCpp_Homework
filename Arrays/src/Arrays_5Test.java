import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays_5Test {

	@Test
	public void test_1() {
		int [] arr = {1, 2, 3, 4};
		int sum = Arrays_5.sum(arr);
		assertEquals(6, sum);
	}

}
