/* This program was developed by Ben Breshears on 1/31/2019 (bhbreshears@dmacc.edu)
Here we implement Java's JPanel library. We create a panel with specific parameters
such as text fields and labels then check to see if they are comparable to their
required variable types. If the age is an integer, and the name starts with a char,
we pass these along into another panel stating their name and age + 1
*/
import javax.swing.*;
import java.lang.NumberFormatException;
public class HelloUserUpgrade{
  public static void main (String[] args){
    JTextField name = new JTextField(5);
    JTextField age = new JTextField(5);
    JPanel panel = new JPanel();
    JPanel error = new JPanel();
    panel.add(new JLabel("First name:"));
    panel.add(name);
    panel.add(Box.createHorizontalStrut(15));
    panel.add(new JLabel("Age: "));
    panel.add(age);
    JOptionPane.showConfirmDialog(null, panel, "Hello! Please enter your first name and your age!", JOptionPane.OK_CANCEL_OPTION);
    String userName = name.getText();
    try{
      int userAge = Integer.parseInt(age.getText());
    }catch(NumberFormatException e){
      JOptionPane.showMessageDialog(error,("INVALID RESPONSE FOR AGE: " + age.getText()));
      System.exit(0);
    }
    if (Character.isDigit(userName.charAt(0)) == true){
      JOptionPane.showMessageDialog(error,("INVALID RESPONSE FOR NAME: " + name.getText()));
      System.exit(0);
    } else {
      int userAge = (Integer.parseInt(age.getText())) + 1;
      String userName1 = userName.substring(0,1).toUpperCase() + userName.substring(1);
      JOptionPane.showMessageDialog(error,("Howdy, " + userName1 + ". Next year you will be " + userAge + " years old."));
    }
  }
}
