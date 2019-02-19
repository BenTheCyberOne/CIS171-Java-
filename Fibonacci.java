/* This program was developed by Ben Breshears on 2/7/2019 (bhbreshears@dmacc.edu)
Here we use a try-catch block to execute the simple algorithm for Fibonacci's
sequence. This will stop once we hit the nth digit, and then print the result */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;

public class Fibonacci{
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter the nth digit: ");
    int a = 0;
    int b = 1;
    int sum = 0;
    try {
      int n = Integer.parseInt(br.readLine());
      for (int i =0; i<n; ++i) {
        sum = (a+b);
        a = b;
        b = sum;
      }
      System.out.println("The digit is: " + sum);
    }
    catch(NumberFormatException e){
      System.out.println(e);
    }
  }
}
