
public class Loops_1 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                j++;
            }
        }
        System.out.println("Summa chetnyh = " + sum);
        System.out.println("Kolichectvo " + j);
    }
}
