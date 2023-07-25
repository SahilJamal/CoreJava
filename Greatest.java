package JavaCore;

public class Greatest {

	public static void main(String args[]) {

		int a = 3;
		int b = 5;
		int c = 2;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest");
			} else {
				System.out.println("c is greatest");
			}
		} else {
			if(b>c) {
				System.out.println("b is greatest");
			} else {
				System.out.println("C is greatest");
			}
		}

	}

}
