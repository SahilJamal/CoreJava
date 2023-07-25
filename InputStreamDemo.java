package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\FileHandling\\demo.txt"));
		
		int i;
		
		while( (i=fis.read())!=-1 ) {
			System.out.print((char)i);
		}
		
		System.out.println((char)i);
		
		fis.close();
	}

}
