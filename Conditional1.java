package JavaCore;
import java.util.Scanner;

public class Conditional {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		// if else
		int age = scanner.nextInt();		
		if(age>=18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible");
		}
		
		
		
	}
	
}
