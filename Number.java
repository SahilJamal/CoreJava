import java.util.*;
class Number 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("enter your first number ");
	a=sc.nextInt();
	System.out.println("enter your second number ");
	b=sc.nextInt();
	if(a<b)
	{
	System.out.println("Your first number is smaller than your second number "+a);
	}
	else
	{
	System.out.println("Your second number is smaller than your first number "+b);
	}
	}
}