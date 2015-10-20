import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_1_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Vvedite dlinu massiva ");
	    int n = Integer.parseInt(reader.readLine());
	    
	    int [] a = new int [n];
	      
	    System.out.println("Vvedite elementy massiva ");
	    for (int i = 0; i < n; i++) {
	       a[i] = Integer.parseInt(reader.readLine());
	       }	
	    
	    int min_i = 0;
	    int min = a[0];
	    for (int i = 0; i < a.length; i++) { 
	    	if (a[i] < min) {
	  		  min = a[i];
	  		  min_i = i;
	  		  }
	    }
	    System.out.println(min); 
	    System.out.println(min_i);
	}
}
