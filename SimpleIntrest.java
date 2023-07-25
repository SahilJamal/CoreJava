import java.util.*;
class SimpleIntrest
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	double p,r,n,a;
	
	System.out.println("enter the principal");
	p=sc.nextDouble();
	System.out.println("enter the rate");
	r=sc.nextDouble();
	System.out.println("enter the number of year");
	n=sc.nextDouble();
	
	a=(p*n*r)/100;
	
	System.out.println("your simple intrest is "+a);
	}
}