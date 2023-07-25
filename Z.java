import java.util.*;
class X
{
	int x;
	public void X()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		x=sc.nextInt();
		}
}
class Y extends X
{
	int y;
	public void Y()
	{
	super.X();
	y=x*x;
	}
}
class Z extends Y
{
	int z;
	public void Z()
	{
	super.Y();
	z=y+x;
	System.out.println("The sum is: "+z);
	}
	public static void main(String args[])
	{
	Z obj=new Z();
	obj.Z();
	}
}