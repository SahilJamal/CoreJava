import java.util.*;
class Number2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Enter the second number");
	b=sc.nextInt();
	System.out.println("Enter the third number");
	c=sc.nextInt();
	if(a==b &&a>c || b==a &&b>c)
	{
		System.out.println("Your first nad second number is greator than your third number");
	}
	else if(b==c &&b>a || c==b &&c>a)
	{
		System.out.println("Your second and third number is greator than your first number ");
	}
	else if(c==a &&c>b || a==c&&a>b)
	{
		System.out.println("Your first and third number is greator than your second number");
	}
	else if(a==b &&b==c &&c==a)
	{
		System.out.println("All three number are equal to each other");
	}
	else
	{
		d=a>b?a:b;
		e=c>d?c:d;
		System.out.println("This is the largest number :"+e);
	}
	}
}