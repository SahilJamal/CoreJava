package JavaCore;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		for(int n=3; n<=10; n++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}
	
}
