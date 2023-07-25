import java.util.*;
class Armstrong
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
	sum=sum+r*r*r;
	n=n/10;
	}
	if(a==sum)
	{
	System.out.println("The number is Armstrong");
	}
	else
	{
	System.out.println("The number is not Armstrong");
	}
	}
	}
