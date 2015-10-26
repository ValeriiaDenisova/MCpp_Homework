package Functions.Functions_4;

public class DistanceBetweenTwoPoints {
	
	public void distanceBetweenTwoPoints (int a, int b, int c, int d) {
		/*int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;*/
		
		double c_min_a = c - a;
		double d_min_b = d - b;
		double dist = Math.sqrt(Math.pow(c_min_a, 2) + Math.pow(d_min_b, 2));
		
		System.out.println(dist);
		
	}

}
