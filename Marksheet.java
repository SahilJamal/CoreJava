import java.util.*;
class Marksheet
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	int a,b,c,d,e,f,g;
	
	System.out.print("marks in s1 ");
	a=sc.nextInt();
	System.out.print("marks in s2 ");
	b=sc.nextInt();
	System.out.print("marks in s3 ");
	c=sc.nextInt();
	System.out.print("marks in s4 ");
	d=sc.nextInt();
	System.out.print("marks in s5 ");
	e=sc.nextInt();
	
	f=a+b+c+d+e;
	g=f/5;
		
	if (a>=35&& b>=35&& c>=35&& d>=35&& e>=35)
	{
	System.out.println("total number is "+f);
	System.out.println("total pesentage is "+g+"%");
	}
	else
	{
	System.out.println("Remark unsucessful");
	}
	}
}