/* This program was developed by Ben Breshears on 2/12/2019 (bhbreshears@dmacc.edu)
Here we make use of the FileReader and FileWriter modules and parse them into Buffered
objects. This is a more safer and faster way using buffers instead of translating between
binary back and forth. A file is created named hello.txt in the current directory and then
is written into. It is then opened and outputted to the terminal. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileTest {
  public static void main(String[] args) throws IOException{
    BufferedReader br = null;
    BufferedWriter bw = null;
    FileReader fr = null;
    FileWriter fw = null;
    try {
      fw = new FileWriter("hello");
      bw = new BufferedWriter(fw);
      bw.write("Hello, World!");
      bw.close();
      fw.close();
      fr = new FileReader("hello.txt");
      br = new BufferedReader(fr);
      String content = br.readLine();
      System.out.println(content);
      br.close();
      fr.close();
    }
    catch(IOException e) {
      System.out.println(e);
    }
}
}
