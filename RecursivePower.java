/* This program was developed by Ben Breshears on 2/25/2019 (bhbreshears@dmacc.edu)
Here we ask the user for 2 integers (one base, one exponent) then try to parse them as
integers. If this works, we call the compute function passing said integers. This then
recursively checks to see if n is equal to 1, if it is not then it will run again but
subtracting 1 from n. If n is an even number, it will run the compute function and
multiply that result but another compute function with the same parameters. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class RecursivePower{
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Please enter a positive integer (the base): ");
      String a = br.readLine();
      System.out.println("Please enter another integer (the exponent): ");
      String n = br.readLine();
      try{
        int aint = Integer.parseInt(a);
        int nint = Integer.parseInt(n);
      }
      catch (Exception e){
        System.out.println(e);
      }
      finally{
        int aint = Integer.parseInt(a);
        int nint = Integer.parseInt(n);
        System.out.println(compute(aint, nint));
  }
}
  public static int compute(int a, int n) {
      if (n == 1) {
          return a;
      } else if (n % 2 == 0) {
          return compute(a, n / 2) * compute(a, n / 2);
      } else {
          return a * compute(a, n - 1);
      }
  }
}
