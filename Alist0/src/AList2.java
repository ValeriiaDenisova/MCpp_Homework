import java.util.Iterator;

public class AList2 implements EList, Iterable<Integer> {
	private int[] ar = new int[30];
	private int end = 15;
	private int start = 15;

	public AList2() {
	}

	public AList2(int[] ini) {
		init(ini);
	}

	@Override
	public int size() {
		return end - start;
	}

	@Override
	public void clear() {
		end = start = ar.length / 2;
	}

	@Override
	public void init(int[] ini) {
		if (ini == null) {
			ini = new int[0];
		}
		start = ar.length / 2 - ini.length / 2;
		for (int i = 0; i < ini.length; i++) {
			ar[start + i] = ini[i];
		}
		end = start + ini.length;
	}

	@Override
	public int[] toArray() {
		int[] tmp = new int[size()];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = ar[start + i];
		}
		return tmp;
	}

	@Override
	public void set(int pos, int val) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() <= pos)
			throw new ArrayIndexOutOfBoundsException();
		ar[start + pos] = val;
	}

	@Override
	public int get(int pos) {
		if (size() == 0)
			throw new IllegalArgumentException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		return ar[start + pos];
	}

	@Override
	public void addStart(int val) {
		ar[--start] = val;
	}

	@Override
	public void addEnd(int val) {
		ar[end++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		if (size() == 0 || size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = end; i > start; i--) {
			if (i > pos + start) {
				ar[i] = ar[i - 1];
			}
		}
		ar[pos + start] = val;
		end++;
	}

	@Override
	public int delStart() {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		return ar[start++];
	}

	@Override
	public int delEnd() {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() == 1)
			throw new ArrayIndexOutOfBoundsException();
		return ar[--end];
	}

	@Override
	public int delPos(int pos) {
		if (size() <= 0)
			throw new NegativeArraySizeException();
		if (size() < pos)
			throw new ArrayIndexOutOfBoundsException();
		int[] tmp = new int[size() - 1];
		int temp = ar[pos + start];
		for (int i = end - 1; i > start; i--) {
			if (i < pos + start) {
				tmp[i - start] = ar[i];
			} else {
				tmp[i - start - 2] = ar[i];
			}
		}
		end--;
		return temp;
	}

	@Override
	public int min() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int res = ar[start];
		for (int i = start; i < end; i++) {
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
		int res = ar[start];
		for (int i = start; i < end; i++) {
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
		int res = start;
		for (int i = start; i < end; i++) {
			if (ar[i] < ar[res]) {
				res = i;
			}
		}
		return res - start;
	}

	@Override
	public int maxIndex() {
		if (size() == 0)
			throw new IllegalArgumentException();
		int res = start;
		for (int i = start; i < end; i++) {
			if (ar[i] > ar[res]) {
				res = i;
			}
		}
		return res - start;
	}

	@Override
	public void reverse() {
		for (int i = start; i < start + size() / 2; i++) {
			int temp = ar[i];
			ar[i] = ar[start - i + end - 1];
			ar[start - i + end - 1] = temp;
		}
	}

	@Override
	public void halfRevers() {
		int hlen = size() / 2;
		int centr = hlen + size() % 2;
		for (int i = start; i < start + hlen; i++) {
			int t = ar[i];
			ar[i] = ar[centr + i];
			ar[centr + i] = t;
		}
	}

	@Override
	public void sort() {
		for (int i = start; i < end; i++) {
			for (int j = end - 1; j > start; j--) {
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
		return new AListItr(ar, start, end);
	}
	
	class AListItr implements Iterator<Integer>{
		int[] rr = null;
		int s = 0;
		int e = 0;
		
		public AListItr(int[] dd, int s, int e) {
		rr = dd;
		this.s = s;
		this.e = e;
		}
		
		@Override
		public boolean hasNext() {
			return s < e;
		}

		@Override
		public Integer next() {
			return rr[s++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
		
		@Override
		public boolean equals(Object obj) 
		{
			System.out.println("Test!!!");
			return super.equals(obj);
		}
		
		//@Override
		public boolean equals2(Object p) 
		{
			
			EList tmp = (EList) p;
			boolean rez = false;
			if(size() != tmp.size())
			{
				return rez;
			}
			for (int i = start; i < end; i++)
			{
					if (ar[i] != tmp.get(i)) {
						return rez;
					} else {
						rez = true;
				}
			}
			return rez;
		}
		
	}

	public boolean equals(Object p) {
		
		EList tmp = (AList2) p;
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
