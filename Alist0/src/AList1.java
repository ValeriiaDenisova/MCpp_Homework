
public class AList1 implements EList {
	private int[] ar = new int[10];
	private int top = 0;

	public AList1() {
	}

	public AList1(int[] ini) {
		init(ini);
	}

	@Override
	public int size() {
		return top;
	}

	@Override
	public void clear() {
		top = 0;
	}

	@Override
	public void init(int[] ini) {
		if (ini == null) {
			ini = new int[0];
		}

		for (int i = 0; i < ini.length; i++) {
			ar[i] = ini[i];
		}
		top = ini.length;
	}

	@Override
	public int[] toArray() {
		int[] tmp = new int[size()];
		for (int i = 0; i < size(); i++) {
			tmp[i] = ar[i];
		}
		return tmp;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		ar[pos] = val;
	}

	@Override
	public int get(int pos) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		return ar[pos];
	}

	@Override
	public void addStart(int val) {
		for (int i = top; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		ar[0] = val;
		top++;
	}

	@Override
	public void addEnd(int val) {
		if (top > ar.length)
			ar = new int[ar.length + 10];
		ar[top++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		if (size() == 0)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = top; i > 0; i--) {
			if (i < pos) {
				ar[i] = ar[i];
			} else {
				ar[i + 1] = ar[i];
			}
		}
		ar[pos] = val;
		top++;
	}

	@Override
	public int delStart() {
		if (top == 0) {
			throw new NegativeArraySizeException();
		}
		for (int i = top; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		return ar[0];

	}

	@Override
	public int delEnd() {
		// top--;
		// int res = ar[top];
		// return res;
		return ar[--top];
	}

	@Override
	public int delPos(int pos) {
		return ar[pos];
	}

	@Override
	public int min() {
		if (size() == 0)
			throw new IllegalArgumentException();

		int res = ar[0];
		for (int i = 1; i < top; i++) {
			if (ar[i] < res) {
				res = ar[i];
			}
		}
		return res;
	}

	@Override
	public int max() {
		if (size() == 0)
			throw new IllegalArgumentException();

		int res = ar[0];
		for (int i = 1; i < top; i++) {
			if (ar[i] > res) {
				res = ar[i];
			}
		}
		return res;
	}

	@Override
	public int minIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();

		int res = 0;
		for (int i = 1; i < top; i++) {
			if (ar[i] < ar[res]) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public int maxIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();

		int res = 0;
		for (int i = 1; i < top; i++) {
			if (ar[i] > ar[res]) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public void reverse() {
		int[] tmp = new int[top];
		int j = 0;

		for (int i = top - 1; i >= 0; i--) {
			tmp[j] = ar[i];
			j++;
		}
		ar = tmp;
	}

	@Override
	public void halfRevers() {
		int hlen = top / 2;
		int centr = hlen + top % 2;
		for (int i = 0; i < hlen; i++) {
			int t = ar[i];
			ar[i] = ar[centr + i];
			ar[centr + i] = t;
		}
	}

	@Override
	public void sort() {
		for (int i = 0; i < top; i++) {
			for (int j = top - 1; j > 0; j--) {
				if (ar[j - 1] > ar[j]) {
					int t = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = t;
				}
			}
		}
	}

}
