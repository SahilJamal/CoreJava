class Sahi
{
	String name;
	public void dis()
	{
	System.out.println("This is method overriding 1");
	}
}
class Jama extends Sahi
{
	String name;
	public void dis()
	{
	System.out.println("This is method overriding 2");
	}
} 
class Ahmad 
{
	public static void main(String args[])
	{
	Sahi s=new Jama();
	Jama a=(Jama)s;

	if(s instanceof Jama)
	{
	System.out.println("This is through instanceof oprator and upcasting method ");
	}
	else if(a instanceof Sahi)
	{
	System.out.println("This is through instanceof oprator and downcasting method ");
	}
	else
	{
	System.out.println("This is neither through instanceof oprator and nor upcasting method ");
	}
	}
}