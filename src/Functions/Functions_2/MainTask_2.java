package Functions.Functions_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Введите число ");
		int n = Integer.parseInt(reader.readLine()); 	

		Numbers number = new Numbers();
		System.out.println(number.inWords(n));
		
		Numbers100_900 numbers100_900 = new Numbers100_900();
		Numbers20_90 numbers20_90 = new Numbers20_90();
		Numbers1_19 numbers1_19 = new Numbers1_19();
		
		numbers100_900.number100_900(n);
		numbers20_90.number20_90(n);
		numbers1_19.number1_19(n);
		}
	}


