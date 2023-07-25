import java.util.*;
class Number1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter the number");
	a=sc.nextInt();
	if(a==0)
	{
	System.out.println("Your number is equal to zero ");
	}
	else if(a>=1)
	{
	System.out.println("Your number is positive number ");
	}
	else if(a<=-1)
	{
	System.out.println("Your number is negative number ");
	}
	}
}