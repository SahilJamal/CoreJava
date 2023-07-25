package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter(new File("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\FileHandling\\demo.txt"));
		fw.write("Divyesh");
		fw.append('P');
		fw.close();
		System.out.println("Written");
	}
	
}
