import java.util.*;
class Modular
{
	public static void main(String args[])
	{
	double a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your quitent ");
	a=sc.nextDouble();
	System.out.print("enter your divisor");
	b=sc.nextDouble();
	c=a%b;
	System.out.print("your reminder is "+c);
	}
}