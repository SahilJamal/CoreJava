import java.util.*;
class Increment
{
	public static void main(String args[])
	{
	int a,b;
	Scanner acc=new Scanner(System.in);
	System.out.print("enter your number ");
	a=acc.nextInt();
	b=++a;
	System.out.print("now your pre-incremented number is "+b);
	}
}