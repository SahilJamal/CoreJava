import java.util.*;
class LCM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int i,a,b,s=1;
	System.out.println("====================================================");
	System.out.println("Enter your value first");
	a=sc.nextInt();
	System.out.println("Enter your second value ");
	b=sc.nextInt();
	System.out.println("====================================================");
	for(i=1;i<=a;i++)
	{
		s=s/i;
	}

	System.out.println(""+s);

	}
}