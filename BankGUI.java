/* This program was developed by Ben Breshears on 4/22/2019 (bhbreshears@dmacc.edu)
Here we create a GUI based programed for a banking application. We first initiate our main menu panel,
then call a function depending on the user's actions. Withdrawing and depositing from the public variable
"balance" is done within a specific method which sanitizes user input. The user is then brought back to the
main menu, showing the balance.
*/
import javax.swing.*;
public class BankGUI{
  public static double balance = 0.0;
  public static JPanel error = new JPanel();
  public static void mainMenu(){
    Object[] options = {"Deposit","Withdraw","Exit"};
    JTextField deposit = new JTextField(5);
    JTextField withdraw = new JTextField(5);
    JPanel main = new JPanel();
    main.add(new JLabel("Balance: "+balance));
    int n = JOptionPane.showOptionDialog(null, main, "DMACC BANKING UNION", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
    if (n == JOptionPane.YES_OPTION){
      depositMenu();
    }
    else if (n == JOptionPane.NO_OPTION){
      withdrawMenu();
    }
    else{
      System.exit(0);
    }
  }
  public static void depositMenu(){
    JPanel depositScreen = new JPanel();
    JTextField deposit = new JTextField(5);
    depositScreen.add(new JLabel("Please enter the desired amount to deposit: "));
    depositScreen.add(deposit);
    JOptionPane.showConfirmDialog(null, depositScreen, "Deposit Menu", JOptionPane.DEFAULT_OPTION);
    try{
      double amountDeposit = Double.parseDouble(deposit.getText());
      if (amountDeposit < 0) {
        JOptionPane.showMessageDialog(error,("YOU CAN NOT DEPOSIT NEGATIVELY"));
        BankGUI.mainMenu();
      }
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(error,("PLEASE INPUT A VALID NUMBER"));
      BankGUI.mainMenu();
    }
    double amountDeposit = Double.parseDouble(deposit.getText());
    balance = balance + amountDeposit;
    BankGUI.mainMenu();
  }
  public static void withdrawMenu(){
    JPanel withdrawScreen = new JPanel();
    JTextField withdraw = new JTextField(5);
    withdrawScreen.add(new JLabel("Please enter the desired amount to withdraw: "));
    withdrawScreen.add(withdraw);
    JOptionPane.showConfirmDialog(null, withdrawScreen, "Withdraw Menu", JOptionPane.DEFAULT_OPTION);
    try{
      double withdrawAmount = Double.parseDouble(withdraw.getText());
      if (withdrawAmount < 0){
        JOptionPane.showMessageDialog(error,("YOU CAN NOT WITHDRAW NEGATIVELY"));
        BankGUI.mainMenu();
      }
      if (withdrawAmount > balance){
        JOptionPane.showMessageDialog(error,("YOU CAN NOT WITHDRAW MORE THAN WHAT YOU HAVE"));
        BankGUI.mainMenu();
      }
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(error,("PLEASE INPUT A VALID NUMBER"));
      BankGUI.mainMenu();
    }
    double withdrawAmount = Double.parseDouble(withdraw.getText());
    balance = balance - withdrawAmount;
    BankGUI.mainMenu();
  }
  public static void main (String[] args){
    boolean test = true;
    while(true){
      BankGUI.mainMenu();
    }
  }
}
