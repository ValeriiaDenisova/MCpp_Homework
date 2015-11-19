
public class AList2 implements EList 
{
	private int[] ar = new int[30];
	private int end   = 15;
	private int start = 15;

	public AList2() 
	{
	}
	public AList2(int[] ini) 
	{
		init(ini);
	}
	
	@Override
	public int size() 
	{
		return end - start;
	}

	@Override
	public void clear() 
	{
		end = start = ar.length/2;
	}

	@Override
	public void init(int[] ini)
	{
		start = ar.length/2 - ini.length/2;
		for (int i = 0; i < ini.length; i++) 
		{
			ar[start+i] = ini[i];
		}
		end = start + ini.length;
	}

	@Override
	public int[] toArray() 
	{
		int[] tmp = new int[size()];
		for (int i = 0; i < tmp.length; i++) 
		{
			tmp[i] = ar[start+i];
		}
		return tmp;
	}

	@Override
	public void set(int pos, int val) {
		ar[start + pos] = val;	
	}

	@Override
	public int get(int pos) {
		return ar[start + pos];
	}

	@Override
	public void addStart(int val) 
	{
		ar[--start] = val;	
	}

	@Override
	public void addEnd(int val) 
	{
		ar[end++] = val;	
	}

	@Override
	public void addPos(int pos, int val) {
		
	}

	@Override
	public int delStart() 
	{
		return ar[start++];
	}

	@Override
	public int delEnd() 
	{
		return ar[--end];
	}

	@Override
	public int delPos(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int min() {
		int res = ar[start];
		for (int i = 1; i < end - start; i++) {
			if (ar[i] < res) {
				res = ar[i];
			}
		}
		return res;
	}

	@Override
	public int max() {
		int res = ar[start];
		for (int i = 1; i < end - start; i++) {
			if (ar[i] > res) {
				res = ar[i];
			}
		}
		return res;
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
