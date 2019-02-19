// This was written by Ben Breshears for CIS 125's final for instructor Rick Charles, do NOT steal.
import java.util.Random; // Import the "Math" module
import java.io.BufferedReader; // Import the "BufferedReader" module
import java.io.InputStreamReader; // Import the "InputStreamReader" module
import java.lang.NumberFormatException; // Import the "InputMismatchException" module
import java.io.IOException; // Import the "IOException" module
public class IntroToProgrammingFinal { // Initiate the file class
  public static void main(String[] args) throws IOException{ //Initiate the "main" class, used as menu
    boolean loop = true; // create the while true loop for constant menu access
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create variable "br" as a new BufferedReader object using the InputStreamReader's System.in
    String lineSpace = System.getProperty("line.separator"); // grab the line seperation property (which is OS dependent) to make the menu look pretty
    while (loop){ // while true loop
      System.out.println("### Welcome to Ben's quick math program! ###" + lineSpace + "### Please select your desired difficulty! ###" + lineSpace + "1. Easy (2 digit addition and subtraction)" + lineSpace + "2. Medium (2 digit addition, subtraction, multiplication and division)" + lineSpace + "3. Hard (3 digit addition, subtraction, multiplication and division)" + lineSpace + "4. Insane (4 digit addition, subtraction, multiplication and division with 3 step algorithms)" + lineSpace + "0. Exit the program"); // Print the menu to show user options
      String s = br.readLine(); // set their input as variable s
      try {
        int choice = Integer.parseInt(s); // Try to parse string s as an int to choice
        if (choice > 4 || choice < 0){ // If user input is lower than 0 or greater than 4, state to the user it must be between those two numbers
          System.out.println("Please enter a number between 1 and 4!");
        }
      } catch (NumberFormatException e) { // If this fails (NumberFormatException) ask user to retry
        System.out.println("Please enter a valid number!");
        break;
      }
      int i = Integer.parseInt(s); // parse the string s to an int since it has already been error checked
      if (i == 1){ // If user input is 1, run the easy difficulty function
        new JavaFinal().easyDifficulty();
      }
      else if (i == 2){ // If user input is 2, go to medium difficulty function
        new JavaFinal().medDifficulty();
      }
      else if (i == 3){ // If user input is 3, go to hard difficulty function
        new JavaFinal().hardDifficulty();
      }
      else if (i == 4){ // If user input is 4, go to insane difficulty function
        new JavaFinal().insDifficulty();
      }
      else if (i == 0){
        System.exit(0);
      }
  }
}
  public static void easyDifficulty() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create variable "br" as a new BufferedReader object using the InputStreamReader's System.in
    int score = 0; // Initiate the score variable
    String operator = ""; // Declare operator as an empty string
    boolean loop = true; // Create the variable for constant looping
    while (loop) { // while true loop
      int answer = 0; // Declare the answer variable
      Random r1 = new Random(); // Create r1 as a child of Random, this will determine the first int
      int random1 = r1.nextInt(98+1)+1; // Declare random1 as the first int with a random range of 1 to 99 (We must state we want 99 as an option, so we add 1 to 98 as the max)
      int random2 = r1.nextInt(98+1)+1; // Declare random2 as the second int with a random range of 1 to 99 (We must state we want 99 as an option, so we add 1 to 98 as the max)
      int test = r1.nextInt(1+1)+1; // Declare the test int as the operator changer with a random range of 1 to 2 (We must state we want 2 as an option, so we add 1 to 1 as the max)
      if (test <= 1){ // If test is lesser than or equal to 1, set the operator as +
        operator = "+";
      }
      else if (test > 1){ // If test is greater than 1, set the operator as -
        operator = "-";
      }
      System.out.println("What is " + random1 + operator + random2); // State the equation
      String s = br.readLine(); // set their input as variable s
      try{
        int i = Integer.parseInt(s); // Try to parse string s as an int
      } catch (NumberFormatException e) { // If this fails (NumberFormatException) ask user to retry
        System.out.println("That's NOT a valid number!!!");
        System.out.println("Your score was: " + score);
        System.out.println("Sending you back to the menu...");
        break;
      }
      if (operator == "-"){ // If operator was set to -, answer will equal first int - second int
        answer = (random1 - random2);
      }
      else if (operator == "+"){ // if operator was set to +, answer will equal first int + second int
        answer = (random1 + random2);
      }
      int userAns = Integer.parseInt(s); // parse the string s to an int since it has already been error checked
      if (userAns == answer){ // if user got the answer right, add one to the score and loop again
        score++;
        System.out.println("You got it right! Next question...");
      }
      else { // if input was incorrect, state answer was wrong and return to main menu
        System.out.println("You're answer was WRONG! Try again next time!");
        System.out.println("You're score was: " + score);
        System.out.println("The answer was: " + answer);
        break;
      }

    }
  }
  public static void medDifficulty() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create variable "br" as a new BufferedReader object using the InputStreamReader's System.in
    int score = 0; // Initiate the score variable
    String operator = ""; // Initiate operator as an empty string
    boolean loop = true; // Create the variable for constant looping
    while (loop) { // while true loop
      int answer = 0;
      Random r1 = new Random(); // Create r1 as a child of Random, this will determine the first int
      int random1 = r1.nextInt(98+1)+1; // Declare random1 as the first int with a random range of 1 to 99 (We must state we want 99 as an option, so we add 1 to 98 as the max)
      int random2 = r1.nextInt(98+1)+1; // Declare random2 as the second int with a random range of 1 to 99 (We must state we want 99 as an option, so we add 1 to 98 as the max)
      int test = r1.nextInt(3+1)+1; // Declare the test int as the operator changer with a random range of 1 to 4 (We must state we want 4 as an option, so we add 1 to 3 as the max)
      if (test == 1){ // If test = 1, set the operator to +
        operator = "+";
      }
      else if (test == 2){ // If test = 2, set the operator to -
        operator = "-";
      }
      else if (test == 3){ // If test = 3, set the operator to *
        operator = "*";
      }
      else if (test == 4){ // If test = 1, set the operator to /
        operator = "/";
      }
      while (random1%random2 != 0){ // make sure integers are divisiable completely with no remainders
        random1 = r1.nextInt(98+1)+1;
        random2 = r1.nextInt(98+1)+1;
      }
      System.out.println("What is " + random1 + operator + random2); // state the equation
      String s = br.readLine(); // set their input as variable s
      try{
        int i = Integer.parseInt(s); // Try to parse string s as an int
      } catch (NumberFormatException e) { // If this fails (NumberFormatException) ask user to retry
        System.out.println("That's NOT a valid number!!!");
        System.out.println("Your score was: " + score);
        System.out.println("Sending you back to the menu...");
        break;
      }
      if (operator == "-"){ // If operator was set to -, answer will equal first int - second int
        answer = (random1 - random2);
      }
      else if (operator == "+"){ // if operator was set to +, answer will equal first int + second int
        answer = (random1 + random2);
      }
      else if (operator == "*"){ // If operator was set to *, answer will equal first int * second int
        answer = (random1 * random2);
      }
      else if (operator == "/"){ // If operator was set to /, answer will equal first int / second int
        answer = (random1/random2);
      }
      int userAns = Integer.parseInt(s); // parse the string s to an int since it has already been error checked
      if (userAns == answer){ // if user got the answer right, add one to the score and loop again
        score++;
        System.out.println("You got it right! Next question...");
      }
      else { // if input was incorrect, state answer was wrong and return to main menu
        System.out.println("You're answer was WRONG! Try again next time!");
        System.out.println("You're score was: " + score);
        System.out.println("The answer was: " + answer);
        break;
      }

  }
}
  public static void hardDifficulty() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create variable "br" as a new BufferedReader object using the InputStreamReader's System.in
    int score = 0; // Initiate the score variable
    String operator = ""; // Initiate operator as an empty string
    boolean loop = true; // Create the variable for constant looping
    while (loop) { // while true loop
      int answer = 0;
      Random r1 = new Random(); // Create r1 as a child of Random, this will determine the first int
      int random1 = r1.nextInt(998+1)+1; // Declare random1 as the first int with a random range of 1 to 999 (We must state we want 99 as an option, so we add 1 to 998 as the max)
      int random2 = r1.nextInt(998+1)+1; // Declare random2 as the second int with a random range of 1 to 999 (We must state we want 99 as an option, so we add 1 to 998 as the max)
      int test = r1.nextInt(3+1)+1; // Declare the test int as the operator changer with a random range of 1 to 4 (We must state we want 4 as an option, so we add 1 to 3 as the max)
      if (test == 1){ // If test = 1, set the operator to +
        operator = "+";
      }
      else if (test == 2){ // If test = 2, set the operator to -
        operator = "-";
      }
      else if (test == 3){ // If test = 3, set the operator to *
        operator = "*";
      }
      else if (test == 4){ // If test = 1, set the operator to /
        operator = "/";
      }
      while (random1%random2 != 0){ // make sure integers are divisiable completely with no remainders
        random1 = r1.nextInt(998+1)+1;
        random2 = r1.nextInt(998+1)+1;
      }
      System.out.println("What is " + random1 + operator + random2); // state the equation
      String s = br.readLine(); // set their input as variable s
      try{
        int i = Integer.parseInt(s); // Try to parse string s as an int
      } catch (NumberFormatException e) { // If this fails (NumberFormatException) ask user to retry
        System.out.println("That's NOT a valid number!!!");
        System.out.println("Your score was: " + score);
        System.out.println("Sending you back to the menu...");
        break;
      }
      if (operator == "-"){ // If operator was set to -, answer will equal first int - second int
        answer = (random1 - random2);
      }
      else if (operator == "+"){ // if operator was set to +, answer will equal first int + second int
        answer = (random1 + random2);
      }
      else if (operator == "*"){ // If operator was set to *, answer will equal first int * second int
        answer = (random1 * random2);
      }
      else if (operator == "/"){ // If operator was set to /, answer will equal first int / second int
        answer = (random1/random2);
      }
      int userAns = Integer.parseInt(s); // parse the string s to an int since it has already been error checked
      if (userAns == answer){ // if user got the answer right, add one to the score and loop again
        score++;
        System.out.println("You got it right! Next question...");
      }
      else { // if input was incorrect, state answer was wrong and return to main menu
        System.out.println("You're answer was WRONG! Try again next time!");
        System.out.println("You're score was: " + score);
        System.out.println("The answer was: " + answer);
        break;
      }

  }
}
  public static void insDifficulty() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Create variable "br" as a new BufferedReader object using the InputStreamReader's System.in
    int score = 0; // Initiate the score variable
    String operator = ""; // Initiate operator as an empty string
    String secondOp = ""; // Initiate the second operator as an empty string
    boolean loop = true; // Create the variable for constant looping
    while (loop) { // while true loop
      int answer = 0;
      Random r1 = new Random(); // Create r1 as a child of Random, this will determine the first int
      int random1 = r1.nextInt(9998+1)+1; // Declare random1 as the first int with a random range of 1 to 9999 (We must state we want 99 as an option, so we add 1 to 9998 as the max)
      int random2 = r1.nextInt(9998+1)+1; // Declare random2 as the second int with a random range of 1 to 9999 (We must state we want 99 as an option, so we add 1 to 9998 as the max)
      int random3 = r1.nextInt(9998+1)+1; // Declare random3 as the third int with a random range of 1 to 9999 (We must state we want 99 as an option, so we add 1 to 9998 as the max)
      int test = r1.nextInt(3+1)+1; // Declare the test int as the operator changer with a random range of 1 to 4 (We must state we want 4 as an option, so we add 1 to 3 as the max)
      int test2 = r1.nextInt(3+1)+1; // Declare the second test int as the second operator changer with a random range from t1
      if (test == 1){ // If test = 1, set the operator to +
        operator = "+";
      }
      else if (test == 2){ // If test = 2, set the operator to -
        operator = "-";
      }
      else if (test == 3){ // If test = 3, set the operator to *
        operator = "*";
      }
      else if (test == 4){ // If test = 1, set the operator to /
        secondOp = "/";
      }
      if (test2 == 1){ // If test2 = 1, set the second operator to +
        secondOp = "+";
      }
      else if (test2 == 2){ // If test2 = 2, set the second operator to -
        secondOp = "-";
      }
      else if (test2 == 3){ // If test2 = 3, set the second operator to *
        secondOp = "*";
      }
      else if (test2 == 4){ // If test2 = 1, set the second operator to /
        secondOp = "/";
      }
      while (random1%random2 != 0 && random2%random3 != 0){ // make sure integers are divisiable completely with no remainders
        random1 = r1.nextInt(9998+1)+1;
        random2 = r1.nextInt(9998+1)+1;
        random3 = r1.nextInt(9998+1)+1;
      }
      System.out.println("What is " + random1 + operator + random2 + secondOp + random3); // state the equation
      String s = br.readLine(); // set their input as variable s
      try{
        int i = Integer.parseInt(s); // Try to parse string s as an int
      } catch (NumberFormatException e) { // If this fails (NumberFormatException) ask user to retry
        System.out.println("That's NOT a valid number!!!");
        System.out.println("Your score was: " + score);
        System.out.println("Sending you back to the menu...");
        break;
      }
      /* Here we will set all the different if statements depending on the values of operator and secondOp.
      This is manually cumbersome, but it must be done if we want completely random equations.
      Is there a better way to do this? */
      if (operator == "-" && secondOp == "-"){ // If operator was set to - and the second operator was set to -, answer will equal first int - second int - third int
        answer = (random1 - random2 - random3);
      }
      else if (operator == "+" && secondOp == "+"){ // If operator was set to - and the second operator was set to -, answer will equal first int + second int + third int
        answer = (random1 + random2 + random3);
      }
      else if (operator == "*" && secondOp == "*"){ // If operator was set to * and the second operator was set to *, answer will equal first int * second int * third int
        answer = (random1 * random2 * random3);
      }
      else if (operator == "/" && secondOp == "/"){ // If operator was set to / and the second operator was set to /, answer will equal first int / second int / third int
        answer = (random1 / random2 / random3);
      }
      else if (operator == "+" && secondOp == "-"){ // If operator was set to + and the second operator was set to -, answer will equal first int + second int - third int
        answer = (random1 + random2 - random3);
      }
      else if (operator == "+" && secondOp == "*"){ // If operator was set to + and the second operator was set to *, answer will equal first int + second int * third int
        answer = (random1 + random2 * random3);
      }
      else if (operator == "+" && secondOp == "/"){ // If operator was set to + and the second operator was set to /, answer will equal first int + second int / third int
        answer = (random1 + random2 / random3);
      }
      else if (operator == "-" && secondOp == "+"){ // If operator was set to - and the second operator was set to +, answer will equal first int - second int + third int
        answer = (random1 - random2 + random3);
      }
      else if (operator == "-" && secondOp == "*"){ // If operator was set to - and the second operator was set to *, answer will equal first int - second int * third int
        answer = (random1 - random2 * random3);
      }
      else if (operator == "-" && secondOp == "/"){ // If operator was set to - and the second operator was set to -, answer will equal first int - second int / third int
        answer = (random1 - random2 / random3);
      }
      else if (operator == "*" && secondOp == "+"){ // If operator was set to * and the second operator was set to +, answer will equal first int * second int + third int
        answer = (random1 * random2 + random3);
      }
      else if (operator == "*" && secondOp == "-"){ // If operator was set to * and the second operator was set to -, answer will equal first int * second int - third int
        answer = (random1 * random2 - random3);
      }
      else if (operator == "*" && secondOp == "/"){ // If operator was set to * and the second operator was set to /, answer will equal first int * second int / third int
        answer = (random1 * random2 / random3);
      }
      else if (operator == "/" && secondOp == "+"){ // If operator was set to / and the second operator was set to +, answer will equal first int / second int + third int
        answer = (random1 / random2 + random3);
      }
      else if (operator == "/" && secondOp == "-"){ // If operator was set to / and the second operator was set to -, answer will equal first int / second int - third int
        answer = (random1 / random2 - random3);
      }
      else if (operator == "/" && secondOp == "*"){ // If operator was set to / and the second operator was set to *, answer will equal first int / second int * third int
        answer = (random1 / random2 * random3);
      }
      int userAns = Integer.parseInt(s); // parse the string s to an double since it has already been error checked
      if (userAns == answer){ // if user got the answer right, add one to the score and loop again
        score++;
        System.out.println("You got it right! Next question...");
      }
      else { // if input was incorrect, state answer was wrong and return to main menu
        System.out.println("You're answer was WRONG! Try again next time!");
        System.out.println("You're score was: " + score);
        System.out.println("The answer was: " + answer);
        break;
      }

  }
}
}
