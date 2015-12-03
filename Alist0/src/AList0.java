import java.util.Iterator;

public class AList0 implements EList, Iterable<Integer> {
	private int[] ar = {};

	public AList0() {
	}

	public AList0(int[] ini) {
		init(ini);
	}

	@Override
	public int size() {
		return ar.length;
	}

	@Override
	public void clear() {
		ar = new int[0];
	}

	@Override
	public void init(int[] ini) {
		if (ini == null) {
			ini = new int[0];
		}
		this.ar = new int[ini.length];
		for (int i = 0; i < ar.length; i++) {
			this.ar[i] = ini[i];
		}
	}

	@Override
	public int[] toArray() {
		int[] tmp = new int[size()];
		for (int i = 0; i < ar.length; i++) {
			tmp[i] = ar[i];
		}
		return tmp;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() < pos)
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
		int[] tmp = new int[size() + 1];
		tmp[0] = val;
		for (int i = 0; i < ar.length; i++) {
			tmp[i + 1] = ar[i];
		}
		ar = tmp;
	}

	@Override
	public void addEnd(int val) {
		int[] tmp = new int[size() + 1];
		tmp[tmp.length - 1] = val;

		for (int i = 0; i < ar.length; i++) {
			tmp[i] = ar[i];
		}
		ar = tmp;
	}

	@Override
	public void addPos(int pos, int val) {
		if (size() == 0)
			throw new ArrayIndexOutOfBoundsException();
		int[] tmp = new int[size() + 1];

		for (int i = 0; i < ar.length; i++) {
			if (i < pos) {
				tmp[i] = ar[i];
			} else {
				tmp[i + 1] = ar[i];
			}
		}
		tmp[pos] = val;
		ar = tmp;
	}

	@Override
	public int delStart() {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		int temp = ar[0];
		if(size() == 1) {	
			ar = new int[0];
			return temp;
			
		}
		int[] tmp = new int[size() - 1];
		for (int i = 0; i < ar.length - 1; i++) {
			tmp[i] = ar[i + 1];
		}
		ar = tmp;
		return temp;
	}

	@Override
	public int delEnd() {
		if (size() == 1)
			throw new ArrayIndexOutOfBoundsException();
		int[] tmp = new int[size() - 1];
		int temp = ar[size() - 1];
		for (int i = 0; i < ar.length - 1; i++) {
			tmp[i] = ar[i];
		}
		ar = tmp;
		return temp;
	}

	@Override
	public int delPos(int pos) {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		int[] tmp = new int[size() - 1];
		int temp =ar[pos];
		for (int i = 0; i < ar.length; i++) {
			if (i < pos) {
				tmp[i] = ar[i];
			} else {
				tmp[i - 1] = ar[i];
			}
		}
		ar = tmp;
		return temp;
	}

	@Override
	public int min() {
		if (size() == 0)
			throw new IllegalArgumentException();

		int res = ar[0];
		for (int i = 1; i < ar.length; i++) {
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
		for (int i = 1; i < ar.length; i++) {
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
		for (int i = 1; i < ar.length; i++) {
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
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > ar[res]) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public void reverse() {
		int[] tmp = new int[size()];
		int j = 0;

		for (int i = ar.length - 1; i >= 0; i--) {
			tmp[j] = ar[i];
			j++;
		}
		ar = tmp;
	}

	@Override
	public void halfRevers() {
		int hlen = ar.length / 2;
		int centr = hlen + ar.length % 2;
		for (int i = 0; i < hlen; i++) {
			int t = ar[i];
			ar[i] = ar[centr + i];
			ar[centr + i] = t;
		}
	}

	@Override
	public void sort() {
		for (int i = 0; i < ar.length; i++) {
			for (int j = ar.length - 1; j > 0; j--) {
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
			return i < ar.length;
		}

		@Override
		public Integer next() {
			return ar[i++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
