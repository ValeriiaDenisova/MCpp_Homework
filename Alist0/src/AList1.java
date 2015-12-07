import java.util.Iterator;

public class AList1 implements EList, Iterable<Integer> {
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
		if (size() == 0 || size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = top; i > 0; i--) {
			if (i > pos) {
				ar[i] = ar[i - 1];
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
		if (top <= 0)
			throw new NegativeArraySizeException();
		if (top == 1)
			throw new ArrayIndexOutOfBoundsException();
		int res = ar[top - 1];
		top--;
		return res;
	}

	@Override
	public int delPos(int pos) {
		if (top <= 0)
			throw new NegativeArraySizeException();
		if (top < pos)
			throw new ArrayIndexOutOfBoundsException();
		int[] tmp = new int[top - 1];
		int temp = ar[pos];
		for (int i = top - 1; i > 0; i--) {
			if (i < pos) {
				tmp[i] = ar[i];
			} else {
				tmp[i - 1] = ar[i];
			}
		}
		top--;
		return temp;
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
		for (int i = 0; i < top / 2; i++) {
			int temp = ar[i];
			ar[i] = ar[top - i - 1];
			ar[top - i - 1] = temp;
		}
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
	
	@Override
	public Iterator<Integer> iterator() {
		AListItr itr = new AListItr();
		return itr;
	}
	
	class AListItr implements Iterator<Integer>{
		
		int i = 0;
		@Override
		public boolean hasNext() {
			return i < top;
		}

		@Override
		public Integer next() {
			return ar[i++];
		}
		
	}

	public boolean equals(Object p) {
		EList tmp = (AList1) p;
		boolean rez = false;
		if(size() != tmp.size())
		{
			return rez;
		}
		for (int i = 0; i < this.size(); i++)
		{
				if (get(i) != tmp.get(i)) {
					return rez;
				} else {
					rez = true;
			}
		}
		return rez;	
	}

}
