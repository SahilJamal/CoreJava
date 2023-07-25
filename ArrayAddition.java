import java.util.*;
class ArrayAddition
{
	public static void main(String args[])
	{
		int i,c;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[2];
	System.out.println("Enter the elements ");
	for(i=0;i<2;i++)
	{
		a[i]=sc.nextInt();
	}
	c=a[0]+a[1];
	System.out.println("The addition of your two number "+c);
	}
}