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
	
	      int [] b = revers_massiv(a);
	      for(int element : b){
		      System.out.print(element + " ");
	      }
	}
	
	public static int[] revers_massiv (int[] a) {
		int [] foo = new int [a.length];
		int j = 0;

		for (int i = a.length - 1; i >= 0; i--) {			
	    	  foo[j]  = a[i];
	    	  j++; 
	      }
		return foo;
	}

}
