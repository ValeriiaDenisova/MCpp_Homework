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
		int[] ini = { 10 };
		int val = 5;
		int[] ex = { 5, 10 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_2() {
		int[] ini = { 10, 20 };
		int val = 5;
		int[] ex = { 5, 10, 20 };
		tree.init(ini);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testAdd_many() {
		int[] ini = { 10, 20, 30, 40, 50 };
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
		int[] ini = { 10 };
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_2() {
		int[] ini = { 10, 20 };
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	@Test
	public void testNodes_many() {
		int[] ini = { 50, 25, 70, 11, 24, 19, 26, 102 };
		int ex = 2;
		tree.init(ini);
		assertEquals(ex, tree.nodes());
	}

	////////////////////////////
	// LeafsSize
	///////////////////////////
	@Test
	public void testLeafs_null() {
		int[] ini = null;
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.leafs());
	}

	@Test
	public void testLeafs_0() {
		int[] ini = {};
		int ex = 0;
		tree.init(ini);
		assertEquals(ex, tree.leafs());
	}

	@Test
	public void testLeafs_1() {
		int[] ini = { 10 };
		int ex = 1;
		tree.init(ini);
		assertEquals(ex, tree.leafs());
	}

	@Test
	public void testLeafs_2() {
		int[] ini = { 10, 20 };
		int ex = 1;
		tree.init(ini);
		assertEquals(ex, tree.leafs());
	}

	@Test
	public void testLeafs_many() {
		int[] ini = { 50, 25, 70, 11, 24, 19, 26, 102 };
		int ex = 3;
		tree.init(ini);
		assertEquals(ex, tree.leafs());
	}

	////////////////////////////
	// Reverse
	///////////////////////////
	@Test
	public void testReverse_null() {
		int[] ini = null;
		int[] ex = {};
		tree.init(ini);
		tree.reverse();
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testReverse_0() {
		int[] ini = {};
		int[] ex = {};
		tree.init(ini);
		tree.reverse();
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testReverse_1() {
		int[] ini = { 10 };
		int[] ex = { 10 };
		tree.init(ini);
		tree.reverse();
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testReverse_2() {
		int[] ini = { 10, 20 };
		int[] ex = { 20, 10 };
		tree.init(ini);
		tree.reverse();
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public void testReverse_many() {
		int[] ini = { 50, 25, 70, 11, 24, 19, 26, 102 };
		int[] ex = { 102, 70, 50, 26, 25, 24, 19, 11 };
		tree.init(ini);
		tree.reverse();
		assertArrayEquals(ex, tree.toArray());
	}
}
