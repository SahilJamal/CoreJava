import java.util.*;
class Modular1
{
	public static void main(String args[])
	{
	double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your quitent ");
	a=sc.nextDouble();
	System.out.print("enter your divisor");
	b=sc.nextDouble();
	a%=b;
	System.out.print("your reminder is "+a);
	}
}