/* This program was developed by Ben Breshears on 3/11/2019 (bhbreshears@dmacc.edu)
Here we create a random object and an array with 10 empty elements. We then fill each
element with a random integer (with a cap at 100) and display information about the
created array using for loops and simple listing math */
import java.util.Random;
public class ArrayTesting{
  public static void main(String[] args){
    int[] array = new int[10];
    Random random = new Random();
    for (int i = 0; i < 10; i++){
      int x = random.nextInt(100);
      array[i] = x;
    }
    System.out.println("Original array elements: ");
    for (int n = 0; n < array.length; n++){
      System.out.print(array[n]+" ");
    }
    System.out.println("\nElements at an even index: ");
    for (int a = 0; a < array.length; a = a+2){
      System.out.print(array[a]+" ");
    }
    System.out.println("\nEvery even element: ");
    for (int b = 0; b < array.length; b++){
      if (array[b] % 2 == 0){
        System.out.print(array[b]+" ");
      }
    }
    System.out.println("\nReverse element order: ");
    for (int c = 9; c >= 0; c--){
      System.out.print(array[c] + " ");
    }
    System.out.println("\nFirst and Last elements: ");
    System.out.println(array[0]+" "+array[9]);
  }
}
