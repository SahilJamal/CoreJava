import java.util.*;
class Arraymatrix_2d
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int m,n,p,q,i,j,k;
	System.out.println("Enter the details of second matrix");
	System.out.println("Enter the number of row");
	m=sc.nextInt();
	System.out.println("Enter the number of coloumn");
	n=sc.nextInt();
	int a [][]=new int[m][n];
	int c [][]=new int[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<p;i++)
	{
		for(j=0;j<q;j++)
		{
		b[i][j]=sc.nextInt();
		}
	}
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=q;j++)
			{
				c[i][j]=0;
				for(k=1;k<=m;k++)
				{
				
				c[i][j]=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}