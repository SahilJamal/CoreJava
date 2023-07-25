package JavaCore;

import java.util.Scanner;

public class Armstrong {

	public static void main(String args[]) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = s.nextInt();
		int arm = 0;
		int temp = num;
		int tempArm = num;
		
		int len =0;
		while(temp!=0) {
			temp = temp /10;
			len++;
		}
		
		while(num!=0) {
			int r = num%10;
			arm = arm + (int)Math.pow((double)r,(double)len);
			num=num/10;
		}
		
		if(tempArm == arm) {
			System.out.println("Number is an arm");
		} else {
			System.out.println("Number is not a arm");
		}
		
	}
	
}
