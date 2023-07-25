import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
	int sum=0,r,n,i,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	n=sc.nextInt();
	a=n;
	while(n!=0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	if(a==sum)
	{
	System.out.println("The number is palindrome");
	}
	else
	{
	System.out.println("The number is not palindrome");
	}
	}
	}
