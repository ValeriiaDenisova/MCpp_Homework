import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite chislo ");
		int a = Integer.parseInt(reader.readLine()); 
		
		int fact = 1;
		
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial = " + fact);
	}

}
