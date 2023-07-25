import java.util.*;
class LoopPrime
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,n,count=0;
	System.out.println("Enter the number");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
		  count++;
		}
	}
	if(count==2)
		{
		System.out.println("The number is a prime number ");
		}
		else
		{
			System.out.println("Ihe number is not a prime number");
		}


	}
}