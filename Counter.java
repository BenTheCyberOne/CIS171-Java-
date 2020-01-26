/**
   This class models a tally counter.
*/
public class Counter
{
   private int value;

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void count()
   {
      value = value + 1;
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
   public void undo(){
     if (value == 0){
       System.out.println("You can not have negative counts!");
     }
     else{
     --value;
     System.out.println("Undo")
     }
   }
}
