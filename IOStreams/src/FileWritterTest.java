import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		FileWriter fw=new FileWriter("abc.txt",true);
		fw.write(97);
		fw.write("pqr");
		fw.flush();
		System.out.println("data inserted in file");
		
	}

}
