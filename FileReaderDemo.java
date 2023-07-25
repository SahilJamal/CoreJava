package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(new File("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\FileHandling\\demo.txt"));
		int i; 
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		
	}
	
}
