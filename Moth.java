/* This program was developed by Ben Breshears on 4/9/2019 (bhbreshears@dmacc.edu)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Moth{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double initPosition = 0;
    double lightPosition = 0;
    boolean test = true;
    while(test){
      System.out.println("Moth Simulation initialized. Please select your option:\n1)New Default Moth\n2)New Moth with settings\n3)Quit");
      String input = br.readLine();
      if (input.equals("3")){
        System.exit(0);
      }
      else if (input.equals("2")){
        Moth.newMoth();
      }
      else if (input.equals("1")){
        Moth.newDefaultMoth();
      }
      else{
        System.out.println("Answer not validated. Please enter 1, 2, or 3");
      }
    }
  }
  public static void newMoth() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double initPosition = 0;
    double lightPosition = 0;
    boolean menu = true;
    System.out.println("Please enter the moth's initial position: ");
    initPosition = Double.parseDouble(br.readLine());
    System.out.println("Please enter the Light's position (leave empty if random)");
    String input2 = br.readLine();
    if (input2.equals("")){
      lightPosition = (Math.random()*((1000-initPosition)+1))+initPosition;
    }
    else{
      lightPosition = Double.parseDouble(input2);
    }
    MothClass moth = new MothClass(initPosition,lightPosition);
    while (menu){
      System.out.println("The light's position: "+lightPosition);
      System.out.println("What would you like your moth to do?\n1)Head to the light\n2)Tell me its position\n3)Perish");
      String choice = br.readLine();
      if (choice.equals("1")){
        moth.moveToLight();
      }
      else if (choice.equals("2")){
        moth.getPosition();
      }
      else if (choice.equals("3")){
        System.out.println("Your moth has perished...");
        System.exit(0);
      }
      else{
        System.out.println("Answer not validated. Please enter 1, 2, or 3");
      }
    }
  }
  public static void newDefaultMoth() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean menu = true;
    MothClass moth = new MothClass();
    while (menu){
      System.out.println("The light's position: 20.0");
      System.out.println("What would you like your moth to do?\n1)Head to the light\n2)Tell me its position\n3)Perish");
      String choice = br.readLine();
      if (choice.equals("1")){
        moth.moveToLight();
      }
      else if (choice.equals("2")){
        moth.getPosition();
      }
      else if (choice.equals("3")){
        System.out.println("Your moth has perished...");
        System.exit(0);
      }
      else{
        System.out.println("Answer not validated. Please enter 1, 2, or 3");
      }
    }
  }
}
