import java.util.*;
class LoopEven1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int i,n;
	System.out.println("====================================================");
	System.out.println("Enter your value ");
	n=sc.nextInt();
	System.out.println("====================================================");
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
		System.out.println(i);
		}
	}
	}
}