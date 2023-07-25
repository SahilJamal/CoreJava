import java.util.*;
class Array1
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int i;
		String a[]=new String[3];
		System.out.print("Enter the full name:");
		for (i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		
			System.out.println("The middle name is "+a[1]);
			
		
	}
}