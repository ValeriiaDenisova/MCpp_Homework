import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Vvedite chislo ");
		int a = Integer.parseInt(reader.readLine()); 
		  
		boolean isComposite = false;
	        for (int i = 2; i < a; i++) {
	            if (a % i == 0) {
	                isComposite = true;
	                break;
	            }
	        }
	        
	        if (isComposite) {
	            System.out.println("Sostavnoe ");
	        } else {
	            System.out.println("Prostoe ");
	        }
	    }
	}
