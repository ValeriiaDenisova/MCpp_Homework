import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite dlinu massiva ");
		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		System.out.println("Vvedite elementy massiva ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		int[] b = change(a);
		for (int element : b) {
			System.out.println(element);
		}
	}

	public static int[] change(int[] a) {
		int hlen = a.length / 2;
		int centr = hlen + a.length % 2;
		for (int i = 0; i < hlen; i++) {
			int t = a[i];
			a[i] = a[centr + i];
			a[centr + i] = t;
		}
		return a;
	}

}
