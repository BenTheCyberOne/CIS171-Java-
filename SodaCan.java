/* This program was developed by Ben Breshears on 3/28/2019 (bhbreshears@dmacc.edu)
This file is an example of a class for the corresponding file SodaCanDemo.java
When called, the initial constructor will set parameters for the object using
anything passed along, otherwise it will use the default constructor which requires
no parameters and will set radius and height to it's own static values.
*/
public class SodaCan{
  private double height = 0;
  private double radius = 0;
  public SodaCan(double height, double radius){
    this.height = height;
    this.radius = radius;
  }
  public SodaCan(){
    this.height = 5;
    this.radius = 5;
  }
  public double getSurfaceArea(){
    return((2*Math.PI*this.radius*this.radius)+(2*Math.PI*this.radius*this.height));
  }
  public double getVolume(){
    return((Math.PI*this.radius*this.radius)*this.height);
  }
}
