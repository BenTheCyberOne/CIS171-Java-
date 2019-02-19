/* This program was developed by Ben Breshears on 1/31/2019 (bhbreshears@dmacc.edu)
Here we use a BufferedReader object (br) to take user's input and set it to "input"
We then test to see if it can be parsed as an int. If it can, then we test if it is
inbetween requirments. We then calculate tax and output it depending on income value.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;

public class IncomeTax1913{
  public static void main(String[] args) throws IOException{
    boolean loop = true;
    double tax = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(loop){
      System.out.println("Please enter your income for the year 1913: ");
      String input = br.readLine();
      try{
        int income = Integer.parseInt(input);
      } catch (NumberFormatException e){
        System.out.println("Please enter a valid income amount.");
        break;
      }
      int income = Integer.parseInt(input);
      if(income <= 50000){
        tax = (income*0.01);
      }
      else if (income > 50000 && income <= 75000){
        tax = (income*0.02);
      }
      else if (income > 75000 && income <= 100000){
        tax = (income*0.03);
      }
      else if (income > 100000 && income <= 250000){
        tax = (income*0.04);
      }
      else if (income > 250000 && income <= 500000){
        tax = (income*0.05);
      }
      else if (income > 500000){
        tax = (income*0.06);
      }
      System.out.println("Your income tax is: " + tax);
    }
  }
}
