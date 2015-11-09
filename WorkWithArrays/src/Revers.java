
public class Revers {
	int [] arr = null;

	public int[] revers_massiv (int[] a) {
		int [] foo = new int [a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {			
	    	  foo[j]  = a[i];
	    	  j++; 
	      }
		return foo;
	}
}
