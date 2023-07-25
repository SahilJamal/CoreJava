import java.util.*;
class ArraySumOfdigit
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
	sum=sum+r;
	n=n/10;
		int a[]=new int[n];
		for(i=0;i<sum;i++)
		{
		a[i]=sc.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
	System.out.println("The sum of digit is "+sum);

	}
	}
}