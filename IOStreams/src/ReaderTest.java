import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		int read1;
		FileReader fr=new FileReader("abc.txt");
//		System.out.println((char)fr.read());
		while ((read1=fr.read())!=-1) {
			System.out.println("data : "+(char)read1);
		}
		fr.close();
		
	}

}
