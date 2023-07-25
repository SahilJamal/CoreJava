import java.util.*;
class LoopOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int i,n;
	System.out.println("====================================================");
	System.out.println("Enter your value ");
	n=sc.nextInt();
	System.out.println("====================================================");
	for(i=1;i<=n;i=i+2)
	{
	System.out.println(i);
	}
	}
}