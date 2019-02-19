public class NestedExample{
  public static void main(String[] args){
    for (int i = 1; i < 3; i++){
      for (int x = 1; x <= (-1 * i + 5); x++){
          System.out.print(i + " " + x);
          System.out.println();
      }
    }
  }
}
