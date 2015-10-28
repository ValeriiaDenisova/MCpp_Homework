import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite chislo ");
		String a = reader.readLine();
		
		char[] revers = revers(a);
	}
	
	public static char[] revers (String a) {
		char [] b = a.toCharArray();
		
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);

		}
		return b;
		
	}

}
