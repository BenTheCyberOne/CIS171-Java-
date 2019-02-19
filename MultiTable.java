/* This program was developed by Ben Breshears on 2/7/2019 (bhbreshears@dmacc.edu)
Here we use a simple nested for loop to create a table formated using System.out.printf().
We print the product of x and y, creating a multiplication table. */
public class MultiTable{
  public static void main(String[] args){
    int sum;
    for (int x=1 ;x<=10; ++x){
      for (int y=1;y<=10;++y){
        sum = x*y;
        System.out.printf("%4d",sum);
      }
      System.out.println();
    }
  }
}
