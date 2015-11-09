
public class Sort {
	int [] arr = null;
	
	public int[] bubble(int[] a) {
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
}
