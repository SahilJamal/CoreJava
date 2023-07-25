package JavaCore;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int op = scanner.nextInt();
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if(op==1) {
			System.out.println("Sum is: "+(n1+n2));
		} else {
			if(op==2) {
				System.out.println("Multi is: "+n1*n2);
			} else {
				if(op==3) {
					System.out.println("Div is: "+(n1/n2));
				} else {
					System.out.println("Enter valid op");
				}
			}
		}
	}

}
