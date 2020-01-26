/* This program was developed by Ben Breshears on 4/9/2019 (bhbreshears@dmacc.edu)
*/
public class MothClass{
  private double initPosition = 0;
  private double lightPosition = 0;
  private double currPosition = 0;
  public MothClass(double initPosition, double lightPosition){
    this.initPosition = initPosition;
    this.lightPosition = lightPosition;
    this.currPosition = initPosition;
  }
  public MothClass(double initPosition){
    this.initPosition = initPosition;
    this.lightPosition = initPosition + 20;
    this.currPosition = initPosition;

  }
  public MothClass(){
    this.initPosition = 0;
    this.lightPosition = 20;
    this.currPosition = this.initPosition;
  }
  public void moveToLight(){
    this.currPosition = this.currPosition+(this.lightPosition - this.currPosition)/2;
  }
  public void getPosition(){
    System.out.println("Your moth is at: "+this.currPosition);
  }
}
