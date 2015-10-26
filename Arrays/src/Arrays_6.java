import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
	      System.out.println("Vvedite dlinu massiva ");
	      int n = Integer.parseInt(reader.readLine());
	      
	      int [] a = new int [n];
	        
	      System.out.println("Vvedite elementy massiva ");
	      for (int i = 0; i < n; i++) {
	         a[i] = Integer.parseInt(reader.readLine());
	         }	
	
	      for (int i = a.length - 1; i >= 0; i--) {
	    	  System.out.println(a[i]);
	      }
	}

}
