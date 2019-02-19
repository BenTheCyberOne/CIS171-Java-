/* This program was developed by Ben Breshears on 2/12/2019 (bhbreshears@dmacc.edu)
Here we make use of the FileReader and FileWriter modules and parse them into Buffered
objects. This is a more safer and faster way using buffers instead of translating between
binary back and forth. We ask the user for an input and output file, then read the input file.
We then create the decoration plus the line count number and append it to the outputFile.
These sessions are closed afterwords. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class LineNumbers {
  public static void main(String[] args) throws IOException{
    BufferedReader br = null;
    BufferedWriter bw = null;
    FileReader fr = null;
    FileWriter fw = null;
    int i = 0;
    try {
      br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Please enter the full path of the input file: ");
      String inputFile = br.readLine();
      System.out.println("Please enter the name of the output file: ");
      String outputFile = br.readLine();
      fr = new FileReader(inputFile);
      br = new BufferedReader(fr);
      fw = new FileWriter(outputFile);
      bw = new BufferedWriter(fw);
      String fileLine = null;
      while((fileLine = br.readLine()) != null) {
        i++;
        bw.write("/* " + i + " */ " + fileLine + "\n");
      }
    }
    catch(IOException e){ //TODO: More Exception catches (FileNotFound, general stacktraces, etc)
      System.out.println(e);
    }
    finally{
      br.close();
      fr.close();
      bw.close();
      fw.close();
    }
  }
}
