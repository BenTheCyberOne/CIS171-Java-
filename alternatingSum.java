/* This program was developed by Ben Breshears on 3/18/2019 (bhbreshears@dmacc.edu)
Here we create an array with elements given by the textbook and run a for loop to
sequentially compute an algorithm. First we take the first element and add it to a
variable called total. We then set a boolean variable "test" to false which in turn
subtracts the next element from the total. The test variable is then set to true and
the cycle continues until the entire array has been read. */
public class alternatingSum{
  public static void main(String[] args){
    int[] array = {1,4,9,16,9,7,4,9,11};
    boolean test = true;
    int total = 0;
    for (int element : array){
      if (test) {
        total += (element);
        test = false;
      }
      else{
        total += (-element);
        test = true;
      }
    }
    System.out.println(total);
  }
}
