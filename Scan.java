import java.util.*;
class Scan
{
	public static void main(String args[])
	{
	int i,n;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[1];
	System.out.println("Enter your number ");
	for(i=0;i<1;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		if(a[i]>0)
		{
			System.out.println("The number "+a[i]+" is a positive number");
		}
		else if(a[i]<0)
		{
			System.out.println("The number "+a[i]+" is a negative number");
		}
		else
		{
		System.out.println("The number is equal to zero");
		}
	}
	
	}
}