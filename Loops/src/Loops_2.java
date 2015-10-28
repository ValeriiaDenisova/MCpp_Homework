import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite chislo ");
		int a = Integer.parseInt(reader.readLine());

		isComposite(a);
	}

	public static String isComposite(int a) {
		boolean isComposite = false;
		String otvet = null;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isComposite = true;
				break;
			}
		}

		if (isComposite) {
			otvet = "Sostavnoe";
		} else {
			otvet = "Prostoe";
		}
		return otvet;
	}
}
