import java.util.*;
class Larger
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
    System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Enter the second number");
	b=sc.nextInt();
	System.out.println("Enter the third number");
	c=sc.nextInt();
	if(a>b &&a>c)
	{
			if(a==b &&a>c)
			{
			 System.out.println("Your first and second number is the larger than your third number number");
			}
			else if(a==c &&a>b)
			{
			 System.out.println("Your first and third number is the larger than your second number number");
			}
			else if(b==c &&b>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(b==a &&b>c)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(c==b &&c>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(c==a &&c>b)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(b==c &&a==c)
			{
			 System.out.println("Your third and second and third number is equal to each other ");
			}
	}
	else if(b>a &&b>c)
	{
	 	    if(a==b &&a>c)
			{
			 System.out.println("Your first and second number is the larger than your third number number");
			}
			else if(a==c &&a>b)
			{
			 System.out.println("Your first and third number is the larger than your second number number");
			}
			else if(b==c &&b>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(b==a &&b>c)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(c==b &&c>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(c==a &&c>b)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(b==c &&a==c)
			{
			 System.out.println("Your third and second and third number is equal to each other ");
			}
	}
	else if(c>a &&c>b)
	{
			if(a==b &&a>c)
			{
			 System.out.println("Your first and second number is the larger than your third number number");
			}
			else if(a==c &&a>b)
			{
			 System.out.println("Your first and third number is the larger than your second number number");
			}
			else if(b==c &&b>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(b==a &&b>c)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(c==b &&c>a)
			{
			 System.out.println("Your third and second number is the larger than your first number number");
			}
			else if(c==a &&c>b)
			{
			 System.out.println("Your third and first number is the larger than your first number number");
			}
			else if(b==c &&a==c)
			{
			 System.out.println("Your third and second and third number is equal to each other ");
			}
	}
	}
	}