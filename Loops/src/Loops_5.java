import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite chislo ");
		int a = Integer.parseInt(reader.readLine());

		int sum = sum(a);
		System.out.println(sum);
	}

	public static int sum(int a) {
		int sum = 0;

		while (a != 0) {
			sum = sum + (a % 10);
			a = a / 10;
		}
		return sum;
	}

}
