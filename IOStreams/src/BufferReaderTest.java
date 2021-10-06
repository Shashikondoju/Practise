import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderTest {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		String data=br.readLine();
		FileWriter fw=new FileWriter("ccc.txt");
		System.out.println(data);
		while ((data=br.readLine())!=null) {
			System.out.println(data);
			fw.write(data+"\n");
		}			
		fw.flush();
		fw.close();
		br.close();
		System.out.println("File copied");
		
	}
}
