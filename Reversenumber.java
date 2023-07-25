import java.util.*;
class Reversenumber
{
	public static void main(String args[])
	{
	int sum=0,r,n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	n=sc.nextInt();
	while(n!=0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	System.out.println("The sum of digit is "+sum);

	}
	}
