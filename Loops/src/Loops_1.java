
public class Loops_1 {
    public static void main(String[] args) {

    	int sum = sum();
    	int quantity = quantity();
        System.out.println("Summa chetnyh = " + sum);
        System.out.println("Kolichectvo " + quantity);
    }
    
    public static int sum () {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
		return sum;
    }
    
    public static int quantity () {
        int quantity = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
            	quantity++;
            }
        }
		return quantity;
    }
}
