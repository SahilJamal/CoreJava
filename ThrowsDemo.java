package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

class Demo {
	void getFile() throws IOException {
		FileReader f = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\ExceptionHandling\\b.txt");
		System.out.println(f.read());
	}
}

public class ThrowsDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		try {
			d.getFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}
}
