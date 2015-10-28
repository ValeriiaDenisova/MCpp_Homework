import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Vvedite dlinu massiva ");
	    int n = Integer.parseInt(reader.readLine());
	    
	    int [] a = new int [n];
	      
	    System.out.println("Vvedite elementy massiva ");
	    for (int i = 0; i < n; i++) {
	       a[i] = Integer.parseInt(reader.readLine());
	       }	
	    
	    int sum = sum(a);
	    System.out.println("Summa elementov massiva s nechetnymi indeksami " + sum);
	}
	
	public static int sum (int [] a){
	    int sum = 0;
	    for (int i = 1; i < a.length; i = i + 2) {
	    	sum = sum + a[i];
	    }
		return sum;
	}

}
