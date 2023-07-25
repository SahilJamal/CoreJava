package JavaCore;

class PrintNumbers {
	
	void numbers() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
}

public class WhileDemo {

	public static void main(String args[]) {
		PrintNumbers pn = new PrintNumbers();
		pn.numbers();
	}
	
}
