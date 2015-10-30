import static org.junit.Assert.*;

import org.junit.Test;

public class Loops_2Test {

	@Test
	public void test_prostoe() {
		String otvet = Loops_2.isComposite("7");
		assertEquals("Prostoe", otvet);
	}
	
	@Test
	public void test_sostavnoe() {
		String otvet = Loops_2.isComposite("100");
		assertEquals("Sostavnoe", otvet);
	}
	
	@Test(expected = NumberFormatException.class)
	public void test_exc() {
		Loops_2.isComposite("Hello");
	}

}
