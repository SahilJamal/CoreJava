import java.util.*;
class equal
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	boolean c;
	int a,b;
	System.out.print("enter your first value ");
	a=sc.nextInt();
	System.out.print("enter your second value ");
	b=sc.nextInt();
	c=a==b;
	System.out.print("your first value is equal to your second value "+c);
	}
}