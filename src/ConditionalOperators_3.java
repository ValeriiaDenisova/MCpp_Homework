import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite 3 chisla");
		int a = Integer.parseInt(reader.readLine()); 
		int b = Integer.parseInt(reader.readLine()); 
		int c = Integer.parseInt(reader.readLine()); 
		
		if (a < 0) { 
			a = 0;
		}
		
		if (b < 0) {
			b = 0;
		}
		
		if (c < 0) {
			c = 0;
		}
		
		System.out.println("Summa pologitelnyh chisel = " + (a + b + c));
	}

}
