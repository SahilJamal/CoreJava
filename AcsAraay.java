import java.util.*;
class AcsAraay
{
	public static void main(String args[])
	{
	int i,j,t;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("Enter the elements ");
	for(i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<10;i++)
	{
		for(j=i+1;j<10;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
			     a[j]=t;
			}
		}
	}
	for(i=0;i<10;i++)
	{
	System.out.println("This is your asendding "+a[i]);
	}
	}
}