import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test {
	// ======================================
	// size
	// ======================================
	@Test
	public void testSize_null() {
		int[] ini = null;
		AList0 xx = new AList0(ini);
		assertEquals(0, xx.size());
	}

	@Test
	public void testSize_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		assertEquals(0, xx.size());
	}

	@Test
	public void testSize_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		assertEquals(1, xx.size());
	}

	@Test
	public void testSize_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		assertEquals(2, xx.size());
	}

	@Test
	public void testSize_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		assertEquals(6, xx.size());
	}

	// ======================================
	// Clear
	// ======================================
	@Test
	public void testClear_null() {
		int[] ini = null;
		AList0 xx = new AList0(ini);
		xx.clear();
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testClear_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.clear();
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testClear_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		xx.clear();
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testClear_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		xx.clear();
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testClear_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		xx.clear();
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	// ======================================
	// Set
	// ======================================
	@Test(expected = IllegalArgumentException.class)
	public void testSet_null() {
		int[] ini = null;
		AList0 xx = new AList0(ini);
		xx.set(2, 222);
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSet_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.set(2, 222);
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		xx.set(2, 222);
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		xx.set(2, 222);
		assertEquals(0, xx.size());
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testSet_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		xx.set(2, 222);
		assertEquals(6, xx.size());
		int[] exp = { 10, 20, 222, 77, 11, 26 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	// ======================================
	// Get
	// ======================================
	@Test(expected = IllegalArgumentException.class)
	public void testGet_null() {
		int[] ini = null;
		AList0 xx = new AList0(ini);
		assertEquals(0, xx.get(2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGet_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		assertEquals(0, xx.get(2));
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGet_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		assertEquals(1, xx.get(2));
	}

	@Test
	public void testGet_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		assertEquals(20, xx.get(1));
	}

	@Test
	public void testGet_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		assertEquals(20, xx.get(1));
	}

	// ======================================
	// AddStart
	// ======================================
	@Test
	public void testAddStart_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.addStart(33);
		assertEquals(1, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddStart_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		xx.addStart(33);
		assertEquals(2, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33, 10 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddStart_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		xx.addStart(33);
		assertEquals(3, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33, 10, 20 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddStart_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		xx.addStart(33);
		assertEquals(7, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33, 10, 20, 34, 77, 11, 26 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}
	
	// ======================================
	// AddEnd
	// ======================================
	@Test
	public void testAddEnd_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.addEnd(33);
		assertEquals(1, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddEnd_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		xx.addEnd(33);
		assertEquals(2, xx.size());
		int[] exp = { 10, 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddEnd_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		xx.addEnd(33);
		assertEquals(3, xx.size());
		int[] exp = { 10, 20, 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddEnd_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		xx.addEnd(33);
		assertEquals(7, xx.size());
		int[] exp = { 10, 20, 34, 77, 11, 26, 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}
	
	// ======================================
	// AddPos
	// ======================================
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.addPos(2, 22);
		assertEquals(1, xx.size());
		assertEquals(33, xx.get(0));
		int[] exp = { 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAddPos_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		xx.addPos(2, 22);
		assertEquals(2, xx.size());
		int[] exp = { 10, 33 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddPos_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		xx.addPos(2, 22);
		assertEquals(3, xx.size());
		int[] exp = { 10, 20, 22 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testAddPos_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		xx.addPos(2, 22);
		assertEquals(7, xx.size());
		int[] exp = { 10, 20, 22, 34, 77, 11, 26 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	// ======================================
	// toArray
	// ======================================
	@Test
	public void testToArray_null() {
		int[] ini = null;
		AList0 xx = new AList0(ini);
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testToArray_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		int[] exp = {};
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testToArray_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		int[] exp = { 10 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testToArray_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		int[] exp = { 10, 20 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void testToArray_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		int[] exp = { 10, 20, 34, 77, 11, 26 };
		int[] act = xx.toArray();
		assertArrayEquals(exp, act);
	}

	// ======================================
	// max
	// ======================================

	@Test(expected = IllegalArgumentException.class)
	public void testMax_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.max();
	}

	@Test
	public void testMax_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		int res = xx.max();
		assertEquals(10, res);
	}

	@Test
	public void testMax_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		int res = xx.max();
		assertEquals(20, res);
	}

	@Test
	public void testMax_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		int res = xx.max();
		assertEquals(77, res);
	}
	// ======================================
	// min
	// ======================================

	@Test(expected = IllegalArgumentException.class)
	public void testMin_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.min();
	}

	@Test
	public void testMin_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		int res = xx.min();
		assertEquals(10, res);
	}

	@Test
	public void testMin_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		int res = xx.min();
		assertEquals(10, res);
	}

	@Test
	public void testMin_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		int res = xx.min();
		assertEquals(10, res);
	}
	// ======================================
	// minIndex
	// ======================================

	@Test(expected = IllegalArgumentException.class)
	public void testMinIndex_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.minIndex();
	}

	@Test
	public void testMinIndex_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		int res = xx.minIndex();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		int res = xx.minIndex();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		int res = xx.minIndex();
		assertEquals(0, res);
	}
	// ======================================
	// maxIndex
	// ======================================

	@Test(expected = IllegalArgumentException.class)
	public void testMaxIndex_0() {
		int[] ini = {};
		AList0 xx = new AList0(ini);
		xx.maxIndex();
	}

	@Test
	public void testMaxIndex_1() {
		int[] ini = { 10 };
		AList0 xx = new AList0(ini);
		int res = xx.maxIndex();
		assertEquals(0, res);
	}

	@Test
	public void testMaxIndex_2() {
		int[] ini = { 10, 20 };
		AList0 xx = new AList0(ini);
		int res = xx.maxIndex();
		assertEquals(1, res);
	}

	@Test
	public void testMaxIndex_many() {
		int[] ini = { 10, 20, 34, 77, 11, 26 };
		AList0 xx = new AList0(ini);
		int res = xx.maxIndex();
		assertEquals(3, res);
	}

}
