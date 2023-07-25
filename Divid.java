import java.util.*;
class Divid
{
	public static void main(String args[])
	{
	Double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your first number ");
	a=sc.nextDouble();
	System.out.print("enter your second number");
	b=sc.nextDouble();
	a/=b;
	System.out.print("your division is "+a);
	}
}