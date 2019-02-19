/* This program was developed by Ben Breshears on 1/28/2019 (bhbreshears@dmacc.edu)
Here we use a BufferedReader object (br) to take user's input and set it to "input"
Then we substring this string into two variables and compare them to their respective
requirements. Note that the number 10 is a special case, as it is a two char string.
For this, we must recognize if there is a 10 immediately, and set the second variable
to a different positional substring. This allows substrings to work properly in their
set positions.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PlayingCards {
  public static void main(String[] args) throws IOException{
    boolean loop = true;
    String num = "";
    String suite = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(loop){
      System.out.println("Enter the card notation(A, 2-10, J, Q, etc): ");
      String input = br.readLine();
      String desc1 = input.substring(0,1);
      String desc2 = input.substring(1);
    if (input.substring(0,2).equals("10")){
      num = "Ten";
      desc2 = input.substring(2,3);
      }
    if (desc1.equalsIgnoreCase("K")) {
			num = "King";
		  }
		else if (desc1.equalsIgnoreCase("Q")) {
			num = "Queen";
		  }
		else if (desc1.equalsIgnoreCase("J")) {
			num = "Jack";
	  	}
    else if (desc1.equalsIgnoreCase("A")) {
  		num = "Ace";
  	  }
		else if (desc1.equals("9")) {
			num = "Nine";
		  }
		else if (desc1.equals("8")) {
			num = "Eight";
	  	}
		else if (desc1.equals("7")) {
			num = "Seven";
		  }
		else if (desc1.equals("6")) {
			num = "Six";
		  }
		else if (desc1.equals("5")) {
			num = "Five";
		  }
		else if (desc1.equals("4")) {
			num = "Four";
	  	}
		else if (desc1.equals("3")) {
			num = "Three";
		  }
		else if (desc1.equals("2")) {
			num = "Two";
		  }
    if (desc2.equalsIgnoreCase("D")) {
      suite = "Diamonds";
    }
    else if (desc2.equalsIgnoreCase("H")) {
      suite = "Hearts";
    }
    else if (desc2.equalsIgnoreCase("C")) {
      suite = "Clubs";
    }
    else if (desc2.equalsIgnoreCase("S")) {
      suite = "Spades";
    }
    System.out.println(num + " of " + suite);
  }
 }
}
