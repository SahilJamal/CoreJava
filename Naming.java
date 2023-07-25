import java.util.*;
class Naming
{
	public static void main(String args[])
	{
	int i,n,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the number of charecter");
	n=sc.nextInt();
	char[] a=new char[n];
	System.out.print("Enter the charecter ");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
		}
		System.out.print("hello ");
		for(i=0;i<a.length;i++)
		{   
             System.out.print(a[i]);			 
		}
		
	}
	}
	