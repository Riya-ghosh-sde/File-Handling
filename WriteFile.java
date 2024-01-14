import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
 public static void main(String[] args)throws IOException{
  FileWriter fw = new FileWriter("abc.text");
  fw.write("Hi i am abc.text file");
  fw.write("\n");
  fw.write("write something");
  fw.flush();
  fw.close();
 }
}