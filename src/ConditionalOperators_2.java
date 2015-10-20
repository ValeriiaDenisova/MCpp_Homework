import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperators_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite x");
		int x = Integer.parseInt(reader.readLine()); 
		System.out.println("Vvedite y");
		int y = Integer.parseInt(reader.readLine()); 
		
		int chetvert = 0;
		if (x > 0 & y > 0) {chetvert = 1;
		} else {
			if (x < 0 & y > 0) {chetvert = 2;
			} else {
				if (x < 0 & y < 0) {chetvert = 3;
				} else {
					if (x > 0 & y < 0) {chetvert = 4;
					} else {
						if (x == 0 & y == 0) {chetvert = 0;}
					}
				}
			}
		}
		System.out.println(chetvert + " chetvert");
	}
}
