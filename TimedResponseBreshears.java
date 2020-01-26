/* This program was developed by Ben Breshears on 3/31/2019 (bhbreshears@dmacc.edu)
Here we ask the user a very intruiging question which should take minutes to answer. We
also get the System's current time in minutes and seconds and calculate the difference
once the user has answered. If the seconds ends up being negative, it will reverse the
calculation which is possible because we also calculate minutes passed. Dialog for the
difference is then shown.
*/
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
public class TimedResponseBreshears{
  public static void main(String[] args){
    LocalDateTime time1 = LocalDateTime.now();
    int difference = 0;
    int difference2 = 0;
    int secs1 = time1.getSecond();
    int mins1 = time1.getMinute();
    JOptionPane.showConfirmDialog(null, "Do you think Cream is better than Black Sabbath?");
    LocalDateTime time2 = LocalDateTime.now();
    int secs2 = time2.getSecond();
    int mins2 = time2.getMinute();
    if (secs2-secs1 > 0){
      difference = secs2-secs1;
    }
    else{
      difference = secs1-secs2;
    }
    difference2 = mins2-mins1;
    JOptionPane.showMessageDialog(null, "End seconds: " + secs2 + "\nStart seconds: " + secs1 + "\nEnd minutes: " + mins2 + "\nStart Minutes: " + mins1 + "\nIt took " + difference2 + " minutes and " + difference + " seconds for you to answer.\nWas it a difficult decision?");
  }
}
