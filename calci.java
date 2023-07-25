import java.util.*;
class claci
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	String c;
	System.out.println("enter your first number ");
	a=sc.nextInt();
	System.out.println("enter your second number ");
	b=sc.nextInt();
	System.out.println("enter your choice:\n+\n-\n*");
	c=sc.next();
	switch(c)
	{
		case 1: 
			c=a+b;
			System.out.println("your addition is "+c);
			break;
		case 2: 
			c=a-b;
			System.out.println("your subtraction is "+c);
			break;
		case 3: 
			c=a*b;
			System.out.println("your multipication is "+c);
			break;
		default
			{
			System.out.println("invalid");
			}
				
	}
	}
}