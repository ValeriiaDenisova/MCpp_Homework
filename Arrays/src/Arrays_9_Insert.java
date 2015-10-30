import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_9_Insert {

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
			insert(a);
			for (int i = 0; i < a.length; i++)
				System.out.println(a[i]);

		} catch (IllegalArgumentException e) {
			System.out.println("Error");
		}
	}

	public static int[] insert(int[] a) {
		if (a == null || a.length == 0) {
			throw new IllegalArgumentException();
		}
		int j, temp;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (j = i - 1; j >= 0 && a[j] > temp; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
		return a;
	}
}
