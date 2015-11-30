
public class LList1 implements EList {
	class Node {
		int val;
		Node next = null;

		public Node(int val) {
			this.val = val;
		}
	}

	Node root = null;

	@Override
	public int size() {
		int ret = 0;
		Node tmp = root;
		while (tmp != null) {
			ret++;
			tmp = tmp.next;
		}
		return ret;
	}

	@Override
	public void clear() {
		root = null;
	}

	@Override
	public void init(int[] ini) {
		if (ini == null) {
			ini = new int[0];
		} else {
		for (int i = ini.length - 1; i >= 0; i--)
			addStart(ini[i]);
		}
	}

	@Override
	public int[] toArray() {
		int[] ret = new int[size()];
		Node tmp = root;
		int i = 0;
		while (tmp != null) {
			ret[i++] = tmp.val;
			tmp = tmp.next;
		}
		return ret;
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
		Node N = new Node(val);
		N.next = root;
		root = N;
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
