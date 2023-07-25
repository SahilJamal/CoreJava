import java.util.*;
class LoopAddition1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int i,n,s=0;
	System.out.println("====================================================");
	System.out.println("Enter your value ");
	n=sc.nextInt();
	System.out.println("====================================================");
	for(i=1;i<=n;i++)
	{
		s=s+i;
	    System.out.println(s);
	}

	}
}