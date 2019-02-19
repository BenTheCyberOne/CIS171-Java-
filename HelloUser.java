// Ben Breshears 1/14/19 bhbreshears@dmacc.edu
import javax.swing.JOptionPane;

public class HelloUser{
  public static void main(String[] args){

    String name = JOptionPane.showInputDialog("What is thy name?");
    System.out.println("Hello there, " + name + "!");

  }
}
