/**
   This class demonstrates the SodaCan class.
*/
public class SodaCanDemo
{
   public static void main(String[] args)
   {
      double result;
      SodaCan can1 = new SodaCan(10,2);

      result = can1.getSurfaceArea();
      System.out.println("Surface Area of Can: " + result);

      result = can1.getVolume();
      System.out.println("Volume of Can: " + result);

      // Default can
      SodaCan can2 = new SodaCan();

      result = can2.getSurfaceArea();
      System.out.println("Surface Area of Default Can: " + result);

      result = can2.getVolume();
      System.out.println("Volume of Default Can: " + result);
   }
}
