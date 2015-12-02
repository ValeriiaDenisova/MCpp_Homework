import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BsTreeTest {
	BsTree tree;

	@Before
	public void setUp() throws Exception {
		tree = new BsTree();
	}

	////////////////////////////
	// Size
	///////////////////////////
	@Test
	public void testSize_null() {
		int[] ini = null;
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.size());
	}

	@Test
	public void testSize_0() {
		int[] ini = {};
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.size());
	}

	@Test
	public void testSize_1() {
		int[] ini = { 10 };
		int ex = 1;
		tree.init(ini);
		assertEquals(ex, tree.size());
	}

	@Test
	public void testSize_2() {
		int[] ini = { 10, 20 };
		int ex = 2;
		tree.init(ini);
		assertEquals(ex, tree.size());
	}

	@Test
	public void testSize_many() {
		int[] ini = { 10, 20, 50, 18, 74 };
		int ex = 5;
		tree.init(ini);
		assertEquals(ex, tree.size());
	}

	////////////////////////////
	// Add
	///////////////////////////
	@Test
	public void testAdd_null() {
		int[] ini = null;
		int val = 5;
		int[] ex = { 5 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_0() {
		int[] ini = {};
		int val = 5;
		int[] ex = { 5 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_1() {
		int[] ini = {10};
		int val = 5;
		int[] ex = { 5, 10 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_2() {
		int[] ini = {10, 20};
		int val = 5;
		int[] ex = { 5, 10, 20 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_many() {
		int[] ini = {10, 20, 30, 40, 50};
		int val = 5;
		int[] ex = { 5, 10, 20, 30, 40, 50 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}
	
	////////////////////////////
	// NodesSize
	///////////////////////////
	@Test
	public void testNodes_null() {
		int[] ini = null;
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_0() {
		int[] ini = {};
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_1() {
		int[] ini = {10};
		int ex = 1;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_2() {
		int[] ini = {10, 20};
		int ex = 2;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_many() {
		int[] ini = {10, 30, 70, 40, 50};
		int ex = 3;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}
}
