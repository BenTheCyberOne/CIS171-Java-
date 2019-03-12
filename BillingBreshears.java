/* This program was developed by Ben Breshears on 2/25/2019 (bhbreshears@dmacc.edu)
Here we create 3 overloaded functions which calculate a total price given certain parameters.
The first will simply add tax and return the total, the second will multiply price by quantity
then add tax, and the third will do the same except subtract a coupon amount before adding tax.*/
public class BillingBreshears{
public static double SALES_TAX = .06;
  public static void main(String[] args){
    System.out.println(computePhotoBill(19.99));
    System.out.println(computePhotoBill(19.99, 2));
    System.out.println(computePhotoBill(19.22, 2, .1));
  }
  public static double computePhotoBill(double price){
    double total = price * SALES_TAX + price;
    total = Math.round(total * 100.0) / 100.0;
    return(total);
  }
  public static double computePhotoBill(double price, int amount){
    double total = price * amount;
    total = total + (total*SALES_TAX);
    total = Math.round(total * 100.0) / 100.0;
    return(total);
  }
  public static double computePhotoBill(double price, int amount, double coupon){
    double total = price * amount;
    total = total - (total * coupon);
    total = total + (total*SALES_TAX);
    total = Math.round(total * 100.0) / 100.0;
    return(total);
  }
}
