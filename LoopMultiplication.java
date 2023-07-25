import java.util.*;
class LoopMultiplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int i,n;
	System.out.println("====================================================");
	System.out.println("Enter your value ");
	n=sc.nextInt();
	System.out.println("====================================================");
	for(i=1;i<=10;i++)
	{
		
		System.out.println(n+"*"+i+"="+n*i);
	}
	}
}