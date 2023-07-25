import java.util.*;
class reverse
{
	public static void main(String args[])
	{
	int i,n,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the number of charecter");
	n=sc.nextInt();
	String[] a=new char[n];
	System.out.println("Enter the charecter ");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
		System.out.print("hello ");
		
		for(j=a.length-1;j>=0;j--)
		{   
             System.out.print(a[j]);
		}
		
		}
}