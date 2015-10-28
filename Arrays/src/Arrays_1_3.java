import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_1_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite dlinu massiva ");
		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		System.out.println("Vvedite elementy massiva ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}
		try {
			int min = fun_min(a);
			int min_i = fun_min_i(a);

			System.out.println(min);
			System.out.println(min_i);
		} catch (IllegalArgumentException e) {
			System.out.println("Error");
		}

	}

	public static int fun_min(int[] a) {
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

	public static int fun_min_i(int[] a) {
		int min_i = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[min_i] < a[i]) {
				min_i = i;
			}
		}
		return min_i;
	}
}
