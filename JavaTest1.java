/* This program was developed by Ben Breshears on 3/5/2019 (bhbreshears@dmacc.edu)
Here we ask the user for an item price and a loyalty number, then enter a try catche
block to parse them into double and integer respectivly. If this works, they will
then be parsed into double x and integer y, and used when the print statement
calls the totalPrice method. This method checks the loyalty number and changes
the discount method accordingly. This method then returns the total discounted price
back to main, where it is printed */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;
import java.io.IOException;
public class JavaTest1{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter the item price: ");
    String price = br.readLine();
    System.out.println("Please enter the customer loyalty number: ");
    String loyalNum = br.readLine();
    try{
      double x = Double.parseDouble(price);
      int y = Integer.parseInt(loyalNum);
    }
    catch(Exception e){
      System.out.println("We are sorry, there was an error in your input: " + e);
      System.exit(0);
    }
      double x = Double.parseDouble(price);
      int y = Integer.parseInt(loyalNum);
    System.out.println("The total price is: "+totalPrice(x,y));
 }

 public static double totalPrice(double price, int loyalNum){
   double discount = 0.0;
   if (loyalNum > 10){
     discount = .1;
   }
   else if (loyalNum > 5 || loyalNum <= 10){
     discount = 0.05;
   }
   else{
     discount = 0.02;
   }
   return(price - (price*discount));
 }
}
