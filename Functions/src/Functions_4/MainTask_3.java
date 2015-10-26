package Functions_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask_3 {

		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			 
			System.out.println("Введите первую координату точки А ");
			int a = Integer.parseInt(reader.readLine()); 
			
			System.out.println("Введите вторую координату точки А ");
			int b = Integer.parseInt(reader.readLine()); 
			
			System.out.println("Введите первую координату точки B ");
			int c = Integer.parseInt(reader.readLine()); 
			
			System.out.println("Введите вторую координату точки B ");
			int d = Integer.parseInt(reader.readLine()); 
			
			DistanceBetweenTwoPoints distansce = new DistanceBetweenTwoPoints();
			distansce.distanceBetweenTwoPoints(a, b, c, d);

	}
}
