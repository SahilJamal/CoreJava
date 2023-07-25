import java.util.*;
class Currency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter your amount");
		a=sc.nextDouble();
	    System.out.println("enter your choice \n1 ind to usd\n2 usd to ind");
		c=sc.nextDouble();
		if(c==1)
		{
		b=a/70;
		System.out.println("This is your currency exchange from usd to ind "+b);
		}
		else
		{
		b=a*70;
		System.out.println("This is your currency exchange from ind to usd "+b);
		}
	}
}