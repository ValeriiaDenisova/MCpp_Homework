package Functions.Functions_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число ");
        int n = Integer.parseInt(reader.readLine());
        
        System.out.println(Number.getNumber(n)); 
  
    }
}
