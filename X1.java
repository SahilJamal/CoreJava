import java.util.*;
class X
{
	String x,y;
	public void X()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		x=sc.next();
		System.out.println("Enter the Email: ");
		y=sc.next();
		}
}
class Y extends X
{
	public void disY()
	{
	super.X();
	System.out.println("The name is: "+x);
	}
}
class A1 extends X
{
	public void a()
	{
	super.X();
	System.out.println("The sum is: "+y);
	}
	public static void main(String args[])
	{
	A1 obj=new A1();
	obj.a();
	
	Y obj2=new Y();
	obj2.disY();
	}
}