import java.util.*;
class LoopFibonacci
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,n,a=0,b=1,c;
	System.out.println("Enter your limit");
	n=sc.nextInt();
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(i=1;i<=n;i++)
	{
		c=a+b; 
		System.out.print(c+" ");
		a=b;
		b=c;
	}


	}
}