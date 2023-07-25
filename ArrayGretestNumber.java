import java.util.*;
class ArrayGretestNumber
{
	public static void main(String args[])
	{
		int i,t,j;
	Scanner sc=new Scanner(System.in);
	int a[]=new int[2];
	System.out.println("Enter the elements ");
	for(i=0;i<2;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++)
	 {
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
                 t=a[i];
				 a[i]=a[j];
				 a[j]=t;
				 }
	    }
	  }
	  System.out.println("The grestest number between two is "+a[0]);
	}
}