/* This program was developed by Ben Breshears on 2/18/2019 (bhbreshears@dmacc.edu)
Here we ask the user for 3 doubles and pass them into a function called "test". This
will check to see if the user input can be parsed into a double. If it can, it will
be assigned to a variable that is passed to a function called average, which finds the
average of those 3 doubles. This function is called during the System.out.println */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Average {
  public static void main(String[] args) throws IOException {
      double x1 = 0;
      double x2 = 0;
      double x3 = 0;
      double average = 0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Please enter the first number: ");
      x1 = test(br.readLine());
      System.out.println("Please enter the second number: ");
      x2 = test(br.readLine());
      System.out.println("Please enter the third number: ");
      x3 = test(br.readLine());
      System.out.println("The average of these values is: " + average(x1,x2,x3));
  }
  public static double test(String input){
    double x = 0;
    try{
      x = Double.parseDouble(input);
    }
    catch (Exception e){
      System.out.println(e);
    }
    finally{
      return(x);
    }
  }
  public static double average(double x, double y, double z){
    double average = (x + y + z)/3;
    return(average);
  }
}
