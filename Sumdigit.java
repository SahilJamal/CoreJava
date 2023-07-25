import java.util.*;
class Sumdigit
{
	public static void main(String args[])
	{
	int sum=0,r,n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	while(n!=0)
	{
	r=n%10;
	sum=sum+r;
	n=n/10;
	}
	System.out.println("The sum of digit is "+sum);

	}
	}
}