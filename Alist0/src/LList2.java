
public class LList2 implements EList {
	class Node {
		int val;
		Node next = null;
		Node prev = null;

		public Node(int val) {
			this.val = val;
		}
	}

	Node front = null;
	Node rear = null;

	@Override
	public int size() {
		int ret = 0;
		Node tmp = front;
		while (tmp != null) {
			ret++;
			tmp = tmp.next;
		}
		return ret;
	}

	@Override
	public void clear() {
		front = null;
		rear = null;
	}

	@Override
	public void init(int[] ar) {
		clear();
		if (ar == null) {
			ar = new int[0];
		} else {
			for (int i = ar.length - 1; i >= 0; i--) {
				addStart(ar[i]);
			}
		}
	}

	@Override
	public int[] toArray() {
		int[] ret = new int[size()];
		Node tmp = front;
		int i = 0;
		while (tmp != null) {
			ret[i++] = tmp.val;
			tmp = tmp.next;
		}
		return ret;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int pos) {
		if (front == null)
			throw new IllegalArgumentException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addStart(int val) {
		Node tmp = new Node(val);
		tmp.next = front;
		front = tmp;
//		p.next.prev = front;
	}

	@Override
	public void addEnd(int val) {
		if (front == null) {
			front = new Node(val);
			return;
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void addPos(int pos, int val) {
		if (size() == 0 || size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		// TODO Auto-generated method stub

	}

	@Override
	public int delStart() {
		if (front == null) {
			throw new NegativeArraySizeException();
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delEnd() {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() == 1)
			throw new ArrayIndexOutOfBoundsException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delPos(int pos) {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int min() {
		if (size() == 0)
			throw new IllegalArgumentException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max() {
		if (size() == 0)
			throw new IllegalArgumentException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void halfRevers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

}
