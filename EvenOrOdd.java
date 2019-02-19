import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EvenOrOdd{
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int isEven = 0;
  int isOdd = 0;
  for (int i =0;i<5;i++){
    System.out.println("Enter your integer: ");
    int input = Integer.parseInt(br.readLine());
    if ((input/2)*2 == input){
      isEven++;
    }
    else{
      isOdd++;
    }
   }
   System.out.println("DONE!");
   System.out.println("Number of even: "+isEven);
   System.out.println("Number of odd: "+isOdd);
  }
 }
