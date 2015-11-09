
public class Min_Max_MinI_MaxI {
	int [] arr = null;
	
	public int fun_min(int[] a) {
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

	public int fun_min_i(int[] a) {
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
}
