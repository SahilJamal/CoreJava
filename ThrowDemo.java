package ExceptionHandling;

import java.util.Scanner;

class AgeNotMatchingException extends RuntimeException {
	
	AgeNotMatchingException(String msg) {
		super(msg);
	}
}

class Voting {
	
	void vote() {
		System.out.println("Enter your age");
		Scanner s= new Scanner(System.in);
		int age = s.nextInt();
		
		if(age>=18) {
			System.out.println("You can vote!");
		} else {
			throw new AgeNotMatchingException("Age nust be greater or equals to 18");
		}
	}
	
}

public class ThrowDemo {

	public static void main(String[] args) {
		
		Voting v = new Voting();
		try {
			v.vote();
		} catch(AgeNotMatchingException e) {
			System.out.println(e);
		}
		
		System.out.println("Completed");
	}
	
}
