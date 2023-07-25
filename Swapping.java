import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	
	int a,b;//integration part
	
	System.out.print("enter your first number");
	a=sc.nextInt();
	System.out.print("enter your second number");
	b=sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.print("now your first number is "+a);
	System.out.print("now your second number is "+b);
	
	
	}
}