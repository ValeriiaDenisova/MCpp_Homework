import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite 3 chisla");
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());

		int rez = fun(a, b, c);
		System.out.println(rez);

	}

	public static int fun(int a, int b, int c) {
		int summa, mult, rez;
		summa = a + b + c;
		mult = a * b * c;
		rez = Math.max(summa, mult) + 3;

		return rez;
	}
}
