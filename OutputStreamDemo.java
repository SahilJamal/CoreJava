package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\FileHandling\\demo.txt"));
		
		String s ="Divyesh Pithadiya";
		
		byte[] bytes = s.getBytes();
		
		fos.write(bytes);
		
		fos.close();
 		
	}
	
}
