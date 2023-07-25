import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("Enter the number");
	a=sc.nextInt();
	b=a%2;
	if(b==0)
	{
	System.out.println("The number is even number ");
	}
	else
	{
	 System.out.println("The number given is odd number");
	}
	}
	}