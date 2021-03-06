import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class DynamicFileCopy {
	static void fileCopy(String srcFile, String destFile) throws IOOperationException {
		
		try(
				BufferedReader br=new BufferedReader(new FileReader(srcFile));
				
				BufferedWriter bw=new BufferedWriter(new FileWriter(destFile));
				)
				{
					while(br.ready()) {
						bw.write(br.readLine()+"\n");
					}
				} //try
				catch (IOException e) {
					throw new IOOperationException(e);
				}
	}//main
}//class
