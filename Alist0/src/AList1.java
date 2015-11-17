
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
		ar[pos] = val;
	}

	@Override
	public int get(int pos) {
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
		if(top>ar.length)
			ar = new int[ar.length+10];
		ar[top++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		for (int i = top; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		ar[0] = val;
		top++;
	}

	@Override
	public int delStart() {
		// TODO Auto-generated method stub
		return 0;
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
