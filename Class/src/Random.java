
public class Random {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		System.out.println(a);
		
		for(int i = 0; i < 11; i++){
			System.out.print((int) (Math.random() * 100) + " ");
		}
		
		for(int i = 0; i < 11; i++){
		System.out.print((int)(Math.random() * (10 - 0)) + " ");
		}
		
		System.out.println(a);

		int n = 10;
		int c = n++ + ++n;
		System.out.println(c);
		
		String str1 = "Hello";
		String str2 = "Hello";
		if (str1 == str2){
			System.out.println("Ravny");
		}

	}

}
