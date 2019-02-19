import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gauss{
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("What will 'n' equal: ");
  String x = br.readLine();
  int n = Integer.parseInt(x);
  int sum = 0;
  for (int i=0; i<=n; i++) {
    sum = sum + i;
  }
  System.out.println("sum is: "+sum);
 }
}
