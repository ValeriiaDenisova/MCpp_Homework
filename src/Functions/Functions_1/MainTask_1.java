package Functions.Functions_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite nomer dnia nedeli ");
		int n = Integer.parseInt(reader.readLine()); 		
		
		DaysOfWeek day = new DaysOfWeek();
		day.dayOfWeek(n);		
	}
}


