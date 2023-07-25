import java.util.*;
class Marksheet1
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
		if(a<=35)
		{
		System.out.println("you are failed in s1");
		}
		if(b<=35)
		{
		System.out.println("you are failed in s2");
		}
		if(c<=35)
		{
		System.out.println("you are failed in s3");
		}
		if(d<=35)
		{
		System.out.println("you are failed in s4");
		}
		if(e<=35)
		{
		System.out.println("you are failed in s5");
		}
		System.out.println("Remark unsucessful");
	}
	}
}