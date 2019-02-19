/* This program was developed by Ben Breshears on 2/12/2019 (bhbreshears@dmacc.edu)
Here we create a for loop to create 2 random objects as integers each iteration. These
integers are checked to see if they add up to either two, three, seven, eleven, or twelve.
If they do, the corresponding variables are incremented by 1. Once the for loop has ran
through 1000 iterations, it will print out how many of each side was calculated. */

public class Dice{
  public static void main(String[] args){
    int two = 0;
    int three = 0;
    int seven = 0;
    int eleven = 0;
    int twelve = 0;
    for (int i = 0; i < 1000; ++i){
      int d1 = (int) (Math.random() * 6) + 1;
      int d2 = (int) (Math.random() * 6) + 1;
      if (d1 + d2 == 2){
        two++;
      }
      else if (d1 + d2 == 3){
        three++;
      }
      else if (d1 + d2 == 7){
        seven++;
      }
      else if (d1 + d2 == 11){
        eleven++;
      }
      else if (d1 + d2 == 12){
        twelve++;
      }
    }
    System.out.println("Out of 1000 rolls, we got:");
    System.out.println("Number of twos: " + two);
    System.out.println("Number of threes: " + three);
    System.out.println("Number of sevens: " + seven);
    System.out.println("Number of elevens: " + eleven);
    System.out.println("Number of twelves: " + twelve);
  }
}
