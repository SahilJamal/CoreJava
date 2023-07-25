import java.util.*;
class Sorting_acendding_array
{
	public static void main(String args[])
	{
	int i,j,c,n,t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the number of element");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the element ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
			}
		}
	}
	for(i=0;i<n;i++)
	{
	System.out.println("This is your Assending order "+a[i]);
	}
	
	}
}