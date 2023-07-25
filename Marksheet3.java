import java.util.*;
class Marksheet3
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	int a,b,c,d,e,f,g,count=0;
	
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
		
	if(a<=100 && b<=100 && c<=100 && d<=100 && e<=100)
	{
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
			count=count+1;
			}
			if(b<=35)
			{
			System.out.println("you are failed in s2");
			count=count+1;
			}
			if(c<=35)
			{
			System.out.println("you are failed in s3");
			count=count+1;
			}
			if(d<=35)
			{
			System.out.println("you are failed in s4");
			count=count+1;
			}
			if(e<=35)
			{
			System.out.println("you are failed in s5");
			count=count+1;
			}
			System.out.println("Remark unsucessful: "+count);
		}
	}
	else
	{
		System.out.println("you enter invalid marks ");
	}
	
	}
}