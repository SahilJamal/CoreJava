import java.util.*;
class Array_test
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0,mul=1;
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
			    sum=a[i]+sum;
                mul=a[i]*mul;
			}
		}
		System.out.println("The addition of element is: "+sum);
				System.out.println("The muliplication of element is: "+mul);
	}
}