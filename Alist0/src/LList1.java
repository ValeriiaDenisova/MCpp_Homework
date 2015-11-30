
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
<<<<<<< HEAD
	public void init(int[] ini) {
		if (ini == null) {
			ini = new int[0];
		} else {
		for (int i = ini.length - 1; i >= 0; i--)
			addStart(ini[i]);
=======
	public void init(int[] ar) {
		clear();
		if (ar == null) {
			ar = new int[0];
			// addStart(0);
		} else {
			for (int i = ar.length - 1; i >= 0; i--) {
				addStart(ar[i]);
			}
>>>>>>> 714f4fcc0f339fd595a972cbb38bd7a9c497af38
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
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		Node p = root;
		for(int i = 0; i < pos; i++){
			p = p.next;
		}
		p.val = val;
	}

	@Override
	public int get(int pos) {
		if (root == null)
			throw new IllegalArgumentException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		Node p = root;
		int rez = 0;
		int i = 0;
		while (i != pos) {
			p = p.next;
			i++;
		}
		rez = p.val;
		return rez;
	}

	@Override
	public void addStart(int val) {
		Node tmp = new Node(val);
		tmp.next = root;
		root = tmp;
	}

	@Override
	public void addEnd(int val) {
		if (root == null) {
			root = new Node(val);
			return;
		}
		Node p = root;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new Node(val);

	}

	@Override
	public void addPos(int pos, int val) {
		if (size() == 0 || size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		int i = 0;
		Node p = root;
		while (i < pos - 1) {
			i++;
			p = p.next;
		}
		Node tmp = new Node(val);
		tmp.next = p.next;
		p.next = tmp;
	}

	@Override
	public int delStart() {
		if (root == null) {
			throw new NegativeArraySizeException();
		}
		Node p = root;
		int rez = 0;
		rez = p.val;
		return rez;
	}

	@Override
	public int delEnd() {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() == 1)
			throw new ArrayIndexOutOfBoundsException();
		Node p = root;
		int rez = 0;		
		while (p.next != null) {
			p = p.next;
			rez = p.val;
		}
		return rez;
	}

	@Override
	public int delPos(int pos) {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		int i = 0;
		Node p = root;
		int rez = 0;
		
		while (i < pos) {
			i++;
			p = p.next;
			rez = p.val;
		}
		return rez;
	}

	@Override
	public int min() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int rez = root.val;
		Node p = root.next;
		while (p != null) {
			if (p.val < rez) {
				rez = p.val;
			}
			p = p.next;
		}
		return rez;
	}

	@Override
	public int max() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int rez = root.val;
		Node p = root.next;
		while (p != null) {
			if (p.val > rez) {
				rez = p.val;
			}
			p = p.next;
		}
		return rez;
	}

	@Override
	public int minIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int rez = root.val;
		int i = 0;
		int minIndex = 0;
		Node p = root.next;
		while (p != null) {
			i++;
			if (p.val < rez) {
				rez = p.val;
				minIndex = i;
			}
			p = p.next;			
		}
		return minIndex;
	}

	@Override
	public int maxIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int rez = root.val;
		int i = 0;
		int maxIndex = 0;
		Node p = root.next;
		while (p != null) {
			i++;
			if (p.val > rez) {
				rez = p.val;
				maxIndex = i;
			}
			p = p.next;			
		}
		return maxIndex;
	}

	@Override
	public void reverse() {
		Node p = root;
		root = null;
		while(p != null) {
			addStart(p.val);
			p = p.next;
		}
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
