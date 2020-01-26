/* This program was developed by Ben Breshears on 3/11/2019 (bhbreshears@dmacc.edu)
Here we create a multi-dimensional array with a set list of rates for a childcare center.
We first ask the user for the childs age and test to make sure it lies between the 0 and 4 year
old range, or if it is set to 999 the system exits. Once the child age has been determined, the
user will input the number of days, which is tested to be between 1 and 5. The program then outputs
the correct rate for the child, needing childDays to be offset by 1 due to the nature of arrays. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ChildcareChargesBreshears{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean test = true;
    int rates[][] = { {30, 60, 88, 115, 140},
                      {26, 52, 70, 96, 120},
                      {24, 46, 67, 89, 110},
                      {22, 40, 60, 75, 88},
                      {20, 35, 50, 66, 84} };
    while(test){
      System.out.println("Please enter the child's age (0-4), or 999 to quit: ");
      int childAge = Integer.parseInt(br.readLine());
      if (childAge == 999){
        System.exit(0);
      }
      else if (childAge >= 0 && childAge <= 4) {
        System.out.println("Please enter the number of days per week the child will be attending(1-5): ");
        int childDays = Integer.parseInt(br.readLine());
        if (childDays >= 1 && childDays <= 5){
          System.out.println("This child's rate total will be "+rates[childAge][childDays-1]+" dollars.");
        }
        else{
          System.out.println("Number of days must be between 1 and 5! (We are closed on weekends!)");
        }
      }
      else{
        System.out.println("Age must be between 0 and 4!");
      }
    }
  }
}
