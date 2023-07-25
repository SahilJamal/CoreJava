import java.util.*;
class BornYear
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,c;
	String a;
	System.out.print("name of student ");
	a=sc.next();
	System.out.print("enter your age ");
	b=sc.nextInt();
	c=2022-b;
	System.out.print("Name of student is "+a);
	System.out.print("Student age is "+b);
	System.out.print("Hello your born year is "+c);
	}
}