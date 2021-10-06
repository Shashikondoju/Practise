import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		DataOutputStream da1=new DataOutputStream(new FileOutputStream("sss.txt"));
		da1.writeUTF("shashi");
		da1.writeInt(97);
		da1.writeBoolean(false);
		da1.writeChar('x');
		System.out.println("data is stored");
		
		DataInputStream da2=new DataInputStream(new FileInputStream("sss.txt"));
		System.out.println(da2.readUTF());
		System.out.println(da2.read());
		System.out.println(da2.readBoolean());
		System.out.println(da2.readChar());
		
		
	}

}
