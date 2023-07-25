import java.util.*;
class Array_2d_Matrix
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,j,k,l,c;
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	sop("Enter your first matrix value ");
	System.out.print("Enter your first coloumn ");
	for(i=0;i<2;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.print("Enter your second coloumn ");
	for(j=0;j<2;j++)
	{
	a[j]=sc.nextInt();
	}		
    sop("Enter your second matrix value ");	
	System.out.print("Enter your first coloumn ");
	for(k=0;k<2;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.print("Enter your second coloumn ");
	for(l=0;l<2;j++)
	{
	a[j]=sc.nextInt();
	}			
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
					c=a[i]*a[j];									
					System.out.print(c);
					}
					System.out.println();
				}
	}
}