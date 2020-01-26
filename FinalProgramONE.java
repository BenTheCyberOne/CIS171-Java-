/* This program was developed by Ben Breshears on 4/30/2019 (bhbreshears@dmacc.edu) */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class FinalProgramONE{
  public static boolean loop = true;
  public static int counter = -2; // Counter is set to -2 so that first question will not contain a "13" value
  public static void main(String[] args) throws IOException {
    while(loop){
      System.out.println("Welcome to the final multiplication challenge!\nEnter '0' to leave");
      FinalProgramONE.program(); // Run the "meat" of the program
    }
  }

  public static void program() throws IOException {
    FinalProgramONEClass question = new FinalProgramONEClass(); // A new "question" object
    if ((counter % 3) == 0){ // Is the counter a clean division of 3? If so, make sure one of the random numbers contains the value "13"
      question.setNumbers();
      int rand1 = question.getNumber1();
      int rand2 = question.getNumber2();
      int answer = question.getAnswer();
      FinalProgramONE.askQuestion(rand1,rand2,answer);
    }
      else{
      int rand1 = (int) (Math.random() * 100) + 1; // Set the random value for rand1 (minimum of 1 so that the answer is never "0")
      int rand2 = (int) (Math.random() * 100) + 1; // Set the random value for rand2 (minimum of 1 so that the answer is never "0")
      question.setNumbers(rand1,rand2);
      int answer = question.getAnswer();
      FinalProgramONE.askQuestion(rand1,rand2,answer);
      }
    }

  public static void askQuestion(int rand1, int rand2, int answer) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("What is: "+rand1+" * "+rand2+"?"); // Ask the question using the passed parameters
    String userInput = br.readLine();
    try{ // Check if the user input can be parsed as an Integer, if not then the user is alerted and the function runs recursively
      int input = Integer.parseInt(userInput);
    }
    catch(Exception e){
      System.out.println("Please input a valid integer.");
      FinalProgramONE.askQuestion(rand1,rand2,answer);
    }
    int input = Integer.parseInt(userInput); // Since the check must have passed to get to this point, parse user input as an Integer
    if (input == answer){ // Check to see if the input was correct. If it was, alert the user and run the program again
      System.out.println("Congrats! That was correct!");
      counter++;
      FinalProgramONE.program();
    }
    else if (input == 0){ // If the user inputs the "0" Integer, exit the program
      System.exit(0);
    }
    else{ // Otherwise alert the user the input was incorrect, and declare how far away the user was to the correct answer
      System.out.println("Too bad, that was incorrect!\nCorrect answer: "+answer+"\nYou were off by: "+(answer-input));
      counter++;
      FinalProgramONE.program();
    }
  }
}
