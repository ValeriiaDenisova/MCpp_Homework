
public class Alist0 {
	int [] a = null;
	
	public int fun_min() {
		if (a == null || a.length == 0){
			throw new IllegalArgumentException();
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public int fun_min_i() {
		int min_i = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[min_i] > a[i]) {
				min_i = i;
			}
		}
		return min_i;
	}
	
	public int fun_max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int fun_max_i(int[] a) {
		int max_i = 0;
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				max_i = i;
			}
		}
		return max_i;
	}
	
	public int[] revers_massiv () {
		int [] foo = new int [a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {			
	    	  foo[j]  = a[i];
	    	  j++; 
	      }
		return foo;
	}

	public int[] half_revers() {
		int hlen = a.length / 2;
		int centr = hlen + a.length % 2;
		for (int i = 0; i < hlen; i++) {
			int t = a[i];
			a[i] = a[centr + i];
			a[centr + i] = t;
		}
		return a;
	}
	
	public int[] print() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return a;
	}
	
	public int size() {
		return a.length;
	}
	
	public int[] bubble() {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > 0; j--) {
				if (a[j - 1] > a[j]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		return a;
	}
	
	public int[] addFirst(int el) {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException();
		}
		int [] foo = new int [a.length + 1];
		foo[0] = el;
		int j = 0;

		for (int i = 0; i < a.length; i++) {			
	    	  foo[j + 1]  = a[i];
	    	  j++; 
	      }		
		return foo;
	}
}
