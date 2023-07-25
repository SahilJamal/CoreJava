import java.util.*;

class whole //whole number from not
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		boolean d,e;
		int a,b,c;
		System.out.println("enter your first number ");
		a=sc.nextInt();
		System.out.println("enter your seecond number ");
		b=sc.nextInt();
		c=a+b;
		d=c>=0;
		e=d&&false;
		System.out.println("This is the whole number "+!e);
		}
}