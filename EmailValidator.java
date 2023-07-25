package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		
		
		System.out.println("Enter email id: ");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();
		
		Pattern pattern = Pattern.compile("[a-z0-9]{1,}@[a-z]{1,}\\.[a-z]{1,}");
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			System.out.println("Valid email");
		} else {
			System.out.println("Invalid email");
		}
		
	}
	
}
