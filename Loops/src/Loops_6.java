import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Vvedite chislo ");
		String str = reader.readLine();

		try {
			int rev = revers(str);
			System.out.println(rev);
		} catch (Exception e) {
			System.out.println("Error");
		}		
	}

	public static int revers(String str) {
		if (str == "(\\d)"){
			throw new NumberFormatException();
		}
		int value = Integer.parseInt(str);
		int result = 0;
		while (value > 0) {
			result = result * 10 + value % 10;
			value /= 10;
		}
		return result;
	}

}
