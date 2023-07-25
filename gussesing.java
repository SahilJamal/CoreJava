import java.util.*;
class numbergussesing extends Exception
{
	public numbergussesing()
	{
		super("right anser");
	}
	public void dis()
	{
		System.out.println("too small");
	}
	public void dis1()
	{
		System.out.println("too big");
	}
	public void dis2()
	{
		System.out.println("almost there");
	}
}
 public class gussesing
{
	public static void main(String args[]) {
		numbergussesing ob=new numbergussesing();
		try
		{
		while(true)
		{
	    Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("welcome to gussesing game");
		System.out.println("Enter the num");
		num=obj.nextInt();
		if(num>=49 && num<59)
		{
			ob.dis2();
		}
		else if(num>60)
		{
			ob.dis1();
		}
		else if(num<49)
		{
			ob.dis();
		}
		else if(num==60)
		{	
			throw new numbergussesing();
		}
		}
		}
		catch(numbergussesing e)
		{
			System.out.println(e);
		}
}
}
