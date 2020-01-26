/* This program was developed by Ben Breshears on 4/30/2019 (bhbreshears@dmacc.edu) */

public class FinalProgramONEClass{
  private int number1 = 0;
  private int number2 = 0;
  private int randomInt = 0;
  private int answer = 0;
  public FinalProgramONEClass(){ // Initial constructor
  }
  public void setNumbers(int rand1, int rand2){ // setting the random numbers
  this.number1 = rand1;
  this.number2 = rand2;
  }
  public void setNumbers(){ // Setting the random numbers every third question
    this.randomInt = (int) (Math.random() * 100);
    if (this.randomInt < 50){ // This will set number1 as the "13" value 50% of the time
      this.number1 = 13;
      this.number2 = (int) (Math.random() * 100) + 1; // Set the random value for number2 (minimum of 1 so that the answer is never "0")
    }
    else{
      this.number2 = 13;
      this.number1 = (int) (Math.random() * 100) + 1; // Set the random value for number1 (minimum of 1 so that the answer is never "0")
    }
  }
  public int getAnswer(){ // Return the product of the two numbers
    this.answer = (this.number1 * this.number2);
    return(this.answer);
  }
  public int getNumber1(){ // Get the number1 value
    return(this.number1);
  }
  public int getNumber2(){ // Get the number2 value
    return(this.number2);
  }
}
