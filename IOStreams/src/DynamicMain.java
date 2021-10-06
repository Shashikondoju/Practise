import java.io.IOException;
import java.util.Scanner;

public class DynamicMain {

	public static void main(String[] args)throws IOException {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter source File");
		String srcFile=scn.next();
		System.out.println("enter Copied File");
		String destFile=scn.next();
		
		try {
			DynamicFileCopy.fileCopy(srcFile, destFile);
			System.out.println("File data is copied");
			}
		catch (IOOperationException e) {
					String errMessage= e.getMessage();
					String[] partMessage=errMessage.split(":");
					System.out.println(partMessage[1]);
					
					Throwable t=e.getCause();
					System.out.println(t.getMessage());
					
					StringBuilder sb=new StringBuilder();
					sb.append("Excecution failed\n");
					sb.append("Reson: ");
					
					if (errMessage.contains(srcFile)) {
						sb.append(srcFile+"file not available");
			
					}
					else if (errMessage.contains(destFile)) {
						sb.append(destFile+"is not available");
					}
					
					else 
						sb.append("Connection closed");
					System.out.println(sb.toString().indent(3));
					System.out.println("=".repeat(25));
					
					System.out.println();
//			e.printStackTrace();
		}
	}

}
