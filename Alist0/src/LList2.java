
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int pos, int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addStart(int val) {
		Node p = new Node(val);
		p.next = front;
		front = p; 
//		p.next.prev = front;
	}

	@Override
	public void addEnd(int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPos(int pos, int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public int delStart() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delEnd() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delPos(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int min() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxIndex() {
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
