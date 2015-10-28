import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_2_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite dlinu massiva ");
		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		System.out.println("Vvedite elementy massiva ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		int max = fun_max(a);
		int max_i = fun_max_i(a);

		System.out.println(max);
		System.out.println(max_i);
	}

	public static int fun_max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int fun_max_i(int[] a) {
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
