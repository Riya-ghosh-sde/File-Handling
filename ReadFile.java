import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("abc.text");
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}