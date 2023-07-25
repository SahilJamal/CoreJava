package JavaCore;
import java.util.*;

public class Calculator {
	
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int operation = scanner.nextInt();
		int n1= scanner.nextInt();
		int n2= scanner.nextInt();
		
		if(operation == 1) {
			System.out.println("Sum is: "+(n1+n2));
		} else if(operation==2) {
			System.out.println("Multi is: "+(n1*n2));
		} else if(operation==3) {
			System.out.println("Div is: "+(n1/n2));
		} else {
			System.out.println("Enter valid operation");
		}
		
		scanner.close();
	}

}
