import java.util.*;
class Array
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[]=new int[10];
		System.out.println("Enter the element:");
		for (i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			System.out.println("This element "+ a[i]+" is even");
			}
		}
		
	}
}l