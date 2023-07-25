import java.util.*;
class claci1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	char choice;
	System.out.println("enter your first number ");
	a=sc.nextInt();
	System.out.println("enter your second number ");
	b=sc.nextInt();
	System.out.println("enter your choice:\n+\n-\n*");
	choice=sc.next().charAt(0);
	switch(choice)
	{
		case '+': 
			c=a+b;
			System.out.println("your addition is "+c);
			break;
		case '-': 
			c=a-b;
			System.out.println("your subtraction is "+c);
			break;
		case '*': 
			c=a*b;
			System.out.println("your multipication is "+c);
			break;
		default:
			{
			System.out.println("invalid");
			}
				
	}
	}
}