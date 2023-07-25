import java.util.*;
class Area2 // assignment
{
	int length,breath;
	public Area2()
	{
		double radius,d;
		Scanner sc=new Scanner(System.in)
		radius=sc.nextDouble();
		d=3.14*radius*radius;
		sop("This is the area of circle: "+d);
	}
	public Area2(int length,int breath)
	{
	int c;
	c=length*breath;
	System.out.println("the area of rectangle is: "+c);
	}
	public static void main(String args[])
	{	
	int length,breath;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the length of rectangle ");
	length=sc.nextInt();
	System.out.println("Enter the breath of rectangle ");
	breath=sc.nextInt();
	Area2 obj=new Area2(length,breath);
	new Area2(length,breath);
	}
}